package com.wcf.sangrmoh.womencatchfashion.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.wcf.sangrmoh.womencatchfashion.modle.ImageUploadInfo;

import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends AppCompatActivity {
    FirebaseStorage storage;
    StorageReference storageReference;
    DatabaseReference databaseReference;
    public static final String Database_Path = "WCF_DATABASE";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();
        databaseReference = FirebaseDatabase.getInstance().getReference(Database_Path);
    }
}
