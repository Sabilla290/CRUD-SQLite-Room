package com.example.sqlroom.data.factory;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.sqlroom.data.BarangDAO;
import com.example.sqlroom.model.Barang;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
}
