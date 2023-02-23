package com.kodilla.matrix.sudoku.options;

import com.kodilla.matrix.sudoku.main.MoveTracking;
import java.util.ArrayList;
import java.util.List;

public final class TrackingOptions {
    private final List<MoveTracking> moveTrackingList = new ArrayList<>();

    public List<MoveTracking> getMoveTrackingList() {
        return moveTrackingList;
    }

    public void addMoveToList(MoveTracking moveTracking) {
        moveTrackingList.add(moveTracking);
    }

}
