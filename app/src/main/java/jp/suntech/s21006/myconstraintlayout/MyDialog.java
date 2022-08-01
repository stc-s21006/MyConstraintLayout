package jp.suntech.s21006.myconstraintlayout;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {
    @NonNull


    public void show(int etName, int etMail, int etComment) {
        //ダイアログビルダーを生成
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //ダイアログのタイトルを設定
        builder.setTitle(R.string.etName);
        //ダイアログのメッセージを設定
        builder.setMessage(R.string.etMail);
        //ダイアログのメッセージを設定
        builder.setMessage(R.string.etComment);

        //Positive Button を設定
        builder.setPositiveButton(R.string.dialog_ok, (dialog, which) -> System.out.println("okがクリックされました"));

    }
}

