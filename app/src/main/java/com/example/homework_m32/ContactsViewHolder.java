package com.example.homework_m32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewContactName;
    private TextView textViewContact;
    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);

    }
    private void initView(View itemView) {
        textViewContactName = itemView.findViewById(R.id.textViewContactName);
        textViewContact = itemView.findViewById(R.id.textViewContact);
    }

    public void onBind(String contactName) {
        String fullName = contactName + " ";
        textViewContactName.setText(fullName);
        if (contactName.length() > 1) {
            String initials = contactName.substring(0, 1);
            textViewContact.setText(initials);
        }
    }
}
