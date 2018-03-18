package com.example.android.mgilangbagaskara_1202154204_studycase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import javax.security.auth.callback.Callback;

public class CariGambar extends AppCompatActivity {
    //mendeklarasikan semua variabel yang digunakan
    EditText search;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_gambar);

        //membuat inisiasi pada masing-masing variabel
        search = findViewById(R.id.mencari);
        gambar = findViewById(R.id.gbr);

    }
    public void tombol (View view){ //method yang dipanggil ketika button diklik
        Picasso.with(this).load(search.getText().toString()) //menggunakan picaso untuk me-load gambar.
                //gambar yang diload akan didapatkan dari id mencari pada variabel Search
                .into(gambar, new com.squareup.picasso.Callback() { //membuat callback
                    @Override
                    public void onSuccess() { //jika nilai kembaliannya gambar dapat diload
                        Toast.makeText(CariGambar.this, "Gambar ditemukan", Toast.LENGTH_SHORT).show();
                        //membuat pesan toast
                    }

                    @Override
                    public void onError() { //jika nilai kembaliannya tidak dapat diload
                        Toast.makeText(CariGambar.this, "Gambar tidak ditemukan", Toast.LENGTH_SHORT).show();
                        //membuat pesan toast
                    }
                });
    }
}
