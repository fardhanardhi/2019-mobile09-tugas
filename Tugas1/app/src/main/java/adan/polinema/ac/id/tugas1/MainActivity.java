package adan.polinema.ac.id.tugas1;

import adan.polinema.ac.id.tugas1.adapters.SuperHeroAdapter;
import adan.polinema.ac.id.tugas1.models.SuperHero;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSuperHero = findViewById(R.id.rvSuperHero);

        SuperHero hero = new SuperHero(R.drawable.batman,"Batman","Identitas asli Batman adalah Bruce Wayne, seorang pengusaha yang kaya raya. Nama Bruce Wayne itu sendiri diambil dari nama tokoh sejarah, yaitu Robert the Bruce dan Anthony Wayne.");
        listSuperHero.add(hero);

        hero = new SuperHero(R.drawable.gareng,"Gareng","adalah punakawan yang berkaki pincang. Hal ini merupakan sebuah sanepa dari sifat Gareng sebagai kawula yang selalu hati-hati dalam bertindak. Selain itu, cacat fisik Gareng yang lain adalah tangan yang ciker atau patah.");
        listSuperHero.add(hero);

        hero = new SuperHero(R.drawable.superman,"Superman", "Superman adalah karakter superhero ciptaan Jerry Siegel (penulis) dan Joe Shuster (artist), yang kini menjadi ikon dunia yang hak ciptanya dipegang oleh DC Comic.");
        listSuperHero.add(hero);

        hero = new SuperHero(R.drawable.petruk,"Petruk", "adalah tokoh punakawan dalam pewayangan Jawa, di pihak keturunan/trah Witaradya. Petruk tidak disebutkan dalam kitab Mahabarata dari India.");
        listSuperHero.add(hero);

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);

        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));



    }
}
