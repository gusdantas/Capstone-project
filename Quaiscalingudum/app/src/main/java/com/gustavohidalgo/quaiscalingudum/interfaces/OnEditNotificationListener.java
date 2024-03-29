package com.gustavohidalgo.quaiscalingudum.interfaces;

/**
 * Created by gustavo.hidalgo on 18/02/06.
 */

import com.gustavohidalgo.quaiscalingudum.models.BusNotification;

/**
 * This interface must be implemented by activities that contain this
 * fragment to allow an interaction in this fragment to be communicated
 * to the activity and potentially other fragments contained in that
 * activity.
 * <p>
 * See the Android Training lesson <a href=
 * "http://developer.android.com/training/basics/fragments/communicating.html"
 * >Communicating with Other Fragments</a> for more information.
 */
public interface OnEditNotificationListener {
    void toEta(BusNotification busNotification);
    void toPickLine(BusNotification busNotification);
    void toDetails(BusNotification busNotification);
    void toSetNotifications(BusNotification busNotification);
    void toFinishCreatingNotification(BusNotification busNotification);
}
