package com.example.nykaa.Fragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.nykaa.Adapters.BrandAdapter;
import com.example.nykaa.Adapters.CompanyAdapter;
import com.example.nykaa.Adapters.LuxeAdapter;
import com.example.nykaa.Adapters.NewBrandsAdapter;
import com.example.nykaa.Data.ModelClass.BrandsModels;
import com.example.nykaa.Data.ModelClass.CompanyModels;
import com.example.nykaa.Data.ModelClass.LuxeModel;
import com.example.nykaa.Data.ModelClass.NewBrandsModels;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.OnCompanyItemClickListeners;
import com.example.nykaa.clickListener.OnItemsClickListeners;

import java.util.ArrayList;


public class BrandsFragment extends Fragment implements OnItemsClickListeners, OnCompanyItemClickListeners, View.OnClickListener {

    RecyclerView mBrandRecyclerView;

    AutoCompleteTextView actv;

    RecyclerView mCompanyRecyclerView;

    RecyclerView mNewBrandsRecyclerView;

    NewBrandsAdapter newBrandsAdapter;

    ImageView mSearchBrands;

    Button LuxeBrands;

    Button mBtnNewBrands;

    CompanyAdapter companyAdapter;

    BrandAdapter brandAdapter;

    ArrayList<NewBrandsModels> newBrandsModels= new ArrayList<>();

    ArrayList<LuxeModel> luxeModels= new ArrayList<>();

    RecyclerView mLuxeModelRecyclerView;

    LuxeAdapter luxeAdapter;

    ArrayList<BrandsModels> brandsModels = new ArrayList<>();

    ArrayList<CompanyModels> companyModels = new ArrayList<>();

    String[] language = {"Adidas", "Adidas Original", "Alfabolic", "ALL PLUS SIZE", "A&S", "A Cluch Story", "A huming Way", "Aachho",
            "Abhishek Sharma", "Active Soul", "Addons", "Adira", "Axdora By Ankita", "ADA", "AditiSOMANI", "Akat Ak", "Allem Soly", "Arrow Sports",
            "BoAt", "B Label", "Baby Alive", "Baby Ellie", "Baggit", "Bagstopia", "Bagsy Malone", "Baise Gaba", "Balezina", "Bansrasi Silk Work", "Baoli", "Barbie",
            "Bbuaago", "Be Imex", "bebe", "beebay", "Bellofox", "biba", "Bling Bag", "Blue Baksa", "BMW", "Boon", "Bohame", "Boult Audio", "Burder", "Buggatti", "BungaTunga",
            "C9 AirWere", "Calvados", "Campana", "Campus Sutra", "Candy Dolls", "Candy Skins", "Caprse", "Carlton London", "Cars", "Cat", "Cats & Bows", "CatWalkas", "CELIO",
            "Deepa by Deepa GurNani", "D'chica", "D'oro", "D'Singer", "DailyObjects", "Daniel klien", "David Jones", "De Moza", "Deme", "Derma were", "Desi Weavess", "De'ANMA",
            "Disney", "Diva Walks", "Diwaah", "DOLCE CRUDO", "Dr Cool", "E20", "Easies", "Ed Hardy", "Eduscience", "Ekaya", "Eksa", "Ella", "Eufy", "ESPRIT", "EUME", "Empress pitra",
            "Exel", "Faballey", "Fable Street", "Fabnest", "Fabula", "Fraies forever", "Fancy Fastels", "Fashion Angels", "Fastrack", "Ferrari", "Festina", "Fire-bott", "Fisher Price",
            "Fitoor", "FIDA", "Flourish", "Flubot", "Forever 21", "Global Desi", "GAYA", "Gopi Vaid", "Gulabo by Abu Sandeep", "Giggles", "Gripp Gulabo", "Jaipur Gerua", "Glitterati by Alankriti",
            "Go Colors", "Gulaal", "Geroo Jaipur", "GULABI DORI", "GIVA", "GAP", "GNIST", "Griffel"};


    public static BrandsFragment newInstance() {

        BrandsFragment brandsFragment = new BrandsFragment();
        return brandsFragment;
    }


    public BrandsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_brands, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LuxeBrands = view.findViewById(R.id.Luxe);

        mBtnNewBrands=view.findViewById(R.id.NewBrands);

        mSearchBrands=view.findViewById(R.id.SearchBrand);

        mSearchBrands.setOnClickListener(this);

        mBtnNewBrands.setOnClickListener(this);

        mNewBrandsRecyclerView=view.findViewById(R.id.RecyclerView4);

        mLuxeModelRecyclerView=view.findViewById(R.id.RecyclerView3);

        LuxeBrands.setOnClickListener(this);

        mBrandRecyclerView = view.findViewById(R.id.RecyclerView2);

        mCompanyRecyclerView = view.findViewById(R.id.RecyclerView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getContext(), android.R.layout.select_dialog_item, language);

        actv = view.findViewById(R.id.autoCompleteTextView);

        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.BLACK);


        buildCompanyData();

        buildData();

        setRecyclerAdapter();

        setCompanyAdapter();


    }

    private void setCompanyAdapter() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mCompanyRecyclerView.setLayoutManager(linearLayoutManager);
        companyAdapter = new CompanyAdapter(companyModels, this);
        mCompanyRecyclerView.setAdapter(companyAdapter);
    }

    private void buildCompanyData() {

        companyModels.add(new CompanyModels("RI.Ritu Kumar"));
        companyModels.add(new CompanyModels("Abhishek Sharma"));
        companyModels.add(new CompanyModels("Abhishek Sharma"));
        companyModels.add(new CompanyModels("Deme"));
        companyModels.add(new CompanyModels("Aarai"));
        companyModels.add(new CompanyModels("THE REAL EFFECT LONDON"));
        companyModels.add(new CompanyModels("Accessher"));
        companyModels.add(new CompanyModels("TarunTahalani"));
        companyModels.add(new CompanyModels("Nilourfer By Aasif Ally"));
        companyModels.add(new CompanyModels("Zobby"));
        companyModels.add(new CompanyModels("CatWalk"));
        companyModels.add(new CompanyModels("Fashor"));
        companyModels.add(new CompanyModels("Rocky Star"));
        companyModels.add(new CompanyModels("House of Hiya"));
        companyModels.add(new CompanyModels("Karrah By Karrah"));
        companyModels.add(new CompanyModels("Hiral Luxery Cashmere"));
        companyModels.add(new CompanyModels("Jayanti Reddy"));
        companyModels.add(new CompanyModels("The Madras Trunk"));
        companyModels.add(new CompanyModels("Namasya"));
        companyModels.add(new CompanyModels("Label Anshita Garg"));
        companyModels.add(new CompanyModels("Akhilam"));
        companyModels.add(new CompanyModels("E20"));
        companyModels.add(new CompanyModels("Saakasha And kinni"));
        companyModels.add(new CompanyModels("TL Design"));
        companyModels.add(new CompanyModels("Idalia"));
        companyModels.add(new CompanyModels("SATAT"));
        companyModels.add(new CompanyModels("Rocky Star"));
        companyModels.add(new CompanyModels("House of Hiya"));
        companyModels.add(new CompanyModels("Karrah By Karrah"));
        companyModels.add(new CompanyModels("Hiral Luxery Cashmere"));
        companyModels.add(new CompanyModels("Jayanti Reddy"));
        companyModels.add(new CompanyModels("The Madras Trunk"));
        companyModels.add(new CompanyModels("Namasya"));
        companyModels.add(new CompanyModels("Untung"));
        companyModels.add(new CompanyModels("Gulaal"));
        companyModels.add(new CompanyModels("Label Nikita"));
        companyModels.add(new CompanyModels("Knaika Sharma"));
        companyModels.add(new CompanyModels("Metro"));
        companyModels.add(new CompanyModels("Mochi"));
        companyModels.add(new CompanyModels("Kunza"));
        companyModels.add(new CompanyModels("PAIO"));
        companyModels.add(new CompanyModels("KORA"));
        companyModels.add(new CompanyModels("Abhishti"));
        companyModels.add(new CompanyModels("KOVET"));

    }

    private void setRecyclerAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mBrandRecyclerView.setLayoutManager(linearLayoutManager);
        brandAdapter = new BrandAdapter(brandsModels, this);
        mBrandRecyclerView.setAdapter(brandAdapter);

    }

    private void buildData() {

        brandsModels.add(new BrandsModels("Popular Brands"));
        brandsModels.add(new BrandsModels("Luxe Brands"));
        brandsModels.add(new BrandsModels("New Brands"));
        brandsModels.add(new BrandsModels("Indians"));

        brandsModels.add(new BrandsModels("Western"));
        brandsModels.add(new BrandsModels("Fusion"));
        brandsModels.add(new BrandsModels("Jewellery"));
        brandsModels.add(new BrandsModels("Bags"));

        brandsModels.add(new BrandsModels("FootWears"));
        brandsModels.add(new BrandsModels("Lingerie"));
        brandsModels.add(new BrandsModels("Accessories"));
        brandsModels.add(new BrandsModels("Kids"));
        brandsModels.add(new BrandsModels("Tech Accessories"));
        brandsModels.add(new BrandsModels("Mens"));

    }

    @Override
    public void ItemClickListeners(int position, BrandsModels models) {

        Toast.makeText(getContext(), "BrandModel" + models + "Position" + position, Toast.LENGTH_SHORT).show();


    }

    @Override
    public void CompanyItemClickListeners(int position, CompanyModels companyModels) {

        Toast.makeText(getContext(), "ComapanyModel" + companyModels, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.Luxe:

                companyModels.clear();

                companyAdapter.notifyDataSetChanged();
                buildLuxeData();
                setLuxeAdapter();
                break;


            case R.id.NewBrands:

                luxeModels.clear();

                luxeAdapter.notifyDataSetChanged();

                buildNewBrands();
                setNewBrands();
                break;

            case R.id.SearchBrand:

        }
    }

    private void setNewBrands() {


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mNewBrandsRecyclerView.setLayoutManager(linearLayoutManager);

        newBrandsAdapter = new NewBrandsAdapter(newBrandsModels);
        mLuxeModelRecyclerView.setAdapter(newBrandsAdapter);


    }

    private void buildNewBrands() {

       newBrandsModels.add(new NewBrandsModels("Lee"));
        newBrandsModels.add(new NewBrandsModels("Cat"));
        newBrandsModels.add(new NewBrandsModels("Hamleys"));
        newBrandsModels.add(new NewBrandsModels("Hot wheels"));
        newBrandsModels.add(new NewBrandsModels("Rowans"));
        newBrandsModels.add(new NewBrandsModels("Giggels"));
        newBrandsModels.add(new NewBrandsModels("Nerf"));
        newBrandsModels.add(new NewBrandsModels("jcb"));
        newBrandsModels.add(new NewBrandsModels("Wwe"));
        newBrandsModels.add(new NewBrandsModels("Hostful"));
        newBrandsModels.add(new NewBrandsModels("Pink Cow"));
        newBrandsModels.add(new NewBrandsModels("Nakul sen"));
        newBrandsModels.add(new NewBrandsModels("London rag"));
        newBrandsModels.add(new NewBrandsModels("Maaikid"));
        newBrandsModels.add(new NewBrandsModels("Eksa"));
        newBrandsModels.add(new NewBrandsModels("Vaku"));
        newBrandsModels.add(new NewBrandsModels("BMW"));
        newBrandsModels.add(new NewBrandsModels("Angrey Owl"));
        newBrandsModels.add(new NewBrandsModels("Noise"));
        newBrandsModels.add(new NewBrandsModels("Diwaah"));
        newBrandsModels.add(new NewBrandsModels("Mevofit"));
        newBrandsModels.add(new NewBrandsModels("Arrow Sports"));
        newBrandsModels.add(new NewBrandsModels("A humming Way"));
        newBrandsModels.add(new NewBrandsModels("Label Y"));


    }


    private void setLuxeAdapter () {

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                mLuxeModelRecyclerView.setLayoutManager(linearLayoutManager);

                luxeAdapter = new LuxeAdapter(luxeModels);
                mLuxeModelRecyclerView.setAdapter(luxeAdapter);


            }

    private void buildLuxeData() {

        luxeModels.add(new LuxeModel("Angry owl"));
        luxeModels.add(new LuxeModel("A Humming Way"));
        luxeModels.add(new LuxeModel("Tann-ed"));
        luxeModels.add(new LuxeModel("Bohame"));
        luxeModels.add(new LuxeModel("Rozina"));
        luxeModels.add(new LuxeModel("Pink Peacock Coutoure"));
        luxeModels.add(new LuxeModel("Deme"));
        luxeModels.add(new LuxeModel("GAYA"));
        luxeModels.add(new LuxeModel("ADITI SOMANI"));
        luxeModels.add(new LuxeModel("Swati Vijaivargie"));
        luxeModels.add(new LuxeModel("Rocky Star"));
        luxeModels.add(new LuxeModel("House of hiya"));
        luxeModels.add(new LuxeModel("Jayanti Reddy"));
        luxeModels.add(new LuxeModel("Rishi & Vibhuti"));
        luxeModels.add(new LuxeModel("Label Anshita Garg"));
        luxeModels.add(new LuxeModel("Saaksha And Kinni"));
        luxeModels.add(new LuxeModel("Knika Sharma"));
        luxeModels.add(new LuxeModel("Varun Bahl"));
        luxeModels.add(new LuxeModel("Rocky Star"));
        luxeModels.add(new LuxeModel("House of hiya"));


    }
}
