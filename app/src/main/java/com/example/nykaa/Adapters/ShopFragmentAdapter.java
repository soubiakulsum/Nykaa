package com.example.nykaa.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.nykaa.Fragments.BrandsFragment;
import com.example.nykaa.Fragments.CategoriesFragment;

public class ShopFragmentAdapter extends FragmentStatePagerAdapter {
    public ShopFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return BrandsFragment.newInstance();
            case 1:
                return CategoriesFragment.newInstance();
        }
        return BrandsFragment.newInstance();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String tabTitle = "";

        switch (position){

            case 0:
                tabTitle = "Categories";
                break;

            case 1:
                tabTitle = "Brands";
                break;
        }
        return tabTitle;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
