package com.kodilla.matrix.sudoku;

import com.kodilla.matrix.sudoku.classesset.GameClassSet;
import com.kodilla.matrix.sudoku.engin.MakeMove;
import com.kodilla.matrix.sudoku.engin.PossibleValues;
import com.kodilla.matrix.sudoku.engin.SudokuSolvedCheck;
import com.kodilla.matrix.sudoku.engin.playerselection.InGameCloningBoard;
import com.kodilla.matrix.sudoku.engin.playerselection.LastMove;
import com.kodilla.matrix.sudoku.engin.playerselection.TaskSelected;
import com.kodilla.matrix.sudoku.engin.setgame.GenerateSudoku;
import com.kodilla.matrix.sudoku.main.Board;
import com.kodilla.matrix.sudoku.main.Move;
import com.kodilla.matrix.sudoku.main.SetSudoku;
import com.kodilla.matrix.sudoku.options.Option;
import com.kodilla.matrix.sudoku.options.TrackingOptions;
import org.junit.jupiter.api.Test;
import static com.kodilla.matrix.sudoku.options.BoardOptions.*;
import static com.kodilla.matrix.sudoku.options.LevelOption.EASY;
import static org.junit.jupiter.api.Assertions.*;

public class SudokuTestSuite {
    private static final BoardForTests boardForTests = new BoardForTests();

    @Test
    void createBoardTest() {
        //Give
        Board board = new Board();
        board.createBoard(BOARD_SIZE_16);
        board.setMaxBoard(BOARD_SIZE_16);

        //When
        int boardSize = board.getBoard().size();
        int rowSize = board.getBoard().get(1).getSudokuRow().size();
        int possibleValues = board.getBoard().get(1).getSudokuRow().get(1).getPossibleValues().size();
        int valueInCell = board.getBoard().get(3).getSudokuRow().get(4).getValue();

        //Then
        assertEquals(16,boardSize);
        assertEquals(16,rowSize);
        assertEquals(16,possibleValues);
        assertEquals(-1,valueInCell);
    }

    @Test
    void makeMoveTest() {
        //Give
        MakeMove makeMove = new MakeMove();
        Board board = new Board();
        boardForTests.addMoves(board);
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
        } catch (CloneNotSupportedException err) {
            System.out.println(err);
        }

        //When
        makeMove.makeMove(deepClonedBoard,"4,2,3");
        assert deepClonedBoard != null;
        int value = deepClonedBoard.getBoard().get(3).getSudokuRow().get(1).getValue();

        //Then
        assertEquals(3,value);
        assertNotEquals(board.getBoard(), deepClonedBoard.getBoard());

    }

    @Test
    void removePossibleValuesTest() {
        //Give
        Board board = new Board();
        PossibleValues possibleValues = new PossibleValues();
        boardForTests.addMoves(board);
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
        } catch (CloneNotSupportedException err) {
            System.out.println(err);
        }

        //When
        assert deepClonedBoard != null;
        possibleValues.removePossibleValuesRow(deepClonedBoard,1,8);
        int boardSize = board.getBoard().get(1).getSudokuRow().get(8).getPossibleValues().size();
        int deepClonedBoardSize = deepClonedBoard.getBoard().get(1).getSudokuRow().get(8).getPossibleValues().size();

        //Then
        assertNotEquals(boardSize, deepClonedBoardSize);
    }

    @Test
    void checkIfSudokuSolvedTest() {
        //Give
        Board board = new Board();
        board.createBoard(BOARD_SIZE_9);
        board.setMaxBoard(BOARD_SIZE_9);
        GenerateSudoku generateSudoku = new GenerateSudoku();
        generateSudoku.generateSudoku(board,BOARD_SIZE_9,SQUARE_SIZE_9);
        SudokuSolvedCheck sudokuSolvedCheck = new SudokuSolvedCheck();
        Option option = new Option(BOARD_SIZE_9, SQUARE_SIZE_9, EASY);
        TrackingOptions trackingOptions = new TrackingOptions();
        SetSudoku setSudoku = new SetSudoku(board, option, trackingOptions, board);

        //When
        boolean checkIfSolved = sudokuSolvedCheck.sudokuSolvedCheck(setSudoku);

        //Then
        assertTrue(checkIfSolved);
    }

    @Test
    void addToTrackingOptionsAfterMoveTest() {
        //Give
        Board board = new Board();
        board.createBoard(BOARD_SIZE_9);
        board.setMaxBoard(BOARD_SIZE_9);
        GameClassSet gameClassSet = new GameClassSet();
        Option option = new Option(BOARD_SIZE_9, SQUARE_SIZE_9, EASY);
        TrackingOptions trackingOptions = new TrackingOptions();
        SetSudoku setSudoku = new SetSudoku(board,option,trackingOptions,board);
        TaskSelected taskSelected = new InGameCloningBoard();
        taskSelected.taskSelected(setSudoku, new Move());

        //When
        int boardSize = setSudoku.getTrackingOptions().getMoveTrackingList().size();
        int beforeBoardValueEntered = setSudoku.getTrackingOptions().getMoveTrackingList().get(boardSize-1).getBoard().getBoard()
                        .get(1).getSudokuRow().get(0).getValue();
        Move move = gameClassSet.getMakeMove().makeMove(setSudoku.getBoard(),"2,1,4");
        taskSelected.taskSelected(setSudoku, move);
        boardSize = setSudoku.getTrackingOptions().getMoveTrackingList().size();
        int afterBoardValueEntered = setSudoku.getTrackingOptions().getMoveTrackingList().get(boardSize-1).getBoard().getBoard()
                .get(1).getSudokuRow().get(0).getValue();

        //Then
        assertEquals(-1, beforeBoardValueEntered);
        assertEquals(4,afterBoardValueEntered);
    }

    @Test
    void reversLastMoveTest() {
        //Give
        Board board = new Board();
        board.createBoard(BOARD_SIZE_9);
        board.setMaxBoard(BOARD_SIZE_9);
        GameClassSet gameClassSet = new GameClassSet();
        Option option = new Option(BOARD_SIZE_9, SQUARE_SIZE_9, EASY);
        TrackingOptions trackingOptions = new TrackingOptions();
        SetSudoku setSudoku = new SetSudoku(board,option,trackingOptions,board);
        TaskSelected taskSelected = new InGameCloningBoard();
        Move move = gameClassSet.getMakeMove().makeMove(setSudoku.getBoard(),"2,1,4");
        taskSelected.taskSelected(setSudoku, move);
        move = gameClassSet.getMakeMove().makeMove(setSudoku.getBoard(),"4,2,8");
        taskSelected.taskSelected(setSudoku, move);

        //When
        taskSelected = new LastMove();
        int boardSize = setSudoku.getTrackingOptions().getMoveTrackingList().size();
        int beforeBoardValueEntered = setSudoku.getTrackingOptions().getMoveTrackingList().get(boardSize-1).getBoard().getBoard()
                .get(3).getSudokuRow().get(1).getValue();
        taskSelected.taskSelected(setSudoku, move);
        boardSize = setSudoku.getTrackingOptions().getMoveTrackingList().size();
        int afterBoardValueEntered = setSudoku.getTrackingOptions().getMoveTrackingList().get(boardSize-1).getBoard().getBoard()
                .get(3).getSudokuRow().get(1).getValue();

        //Then
        assertEquals(8, beforeBoardValueEntered);
        assertEquals(-1,afterBoardValueEntered);
    }

}
