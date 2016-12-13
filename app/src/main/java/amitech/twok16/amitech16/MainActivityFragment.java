package amitech.twok16.amitech16;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Button skip;
    private ViewPager _mViewPager;
    private ImageViewPagerAdapter _adapter;
    private ImageView _btn1, _btn2, _btn3;

    public MainActivityFragment() {
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpView();
        setTab();
        onCircleButtonClick();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    private void onCircleButtonClick() {

        _btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _btn1.setImageResource(R.drawable.fill_circ_small_17);
                _mViewPager.setCurrentItem(0);
            }
        });

        _btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _btn2.setImageResource(R.drawable.fill_circ_small_17);
                _mViewPager.setCurrentItem(1);
            }
        });
        _btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _btn3.setImageResource(R.drawable.fill_circ_small_17);
                _mViewPager.setCurrentItem(2);
            }
        });
    }

    private void setUpView() {
        _mViewPager = (ViewPager) getView().findViewById(R.id.imageviewPager);
        _adapter = new ImageViewPagerAdapter(getActivity(), getFragmentManager());
        _mViewPager.setOffscreenPageLimit(1);
        _mViewPager.setAdapter(_adapter);
        _mViewPager.setCurrentItem(0);
        initButton();
    }

    private void setTab() {
        _mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrollStateChanged(int position) {
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageSelected(int position) {
                _btn1.setImageResource(R.drawable.holo_circ_small);
                _btn2.setImageResource(R.drawable.holo_circ_small);
                _btn3.setImageResource(R.drawable.holo_circ_small);
                if (position == 2) {
                    skip.setText("Get Started");
                } else {
                    skip.setText("Skip");
                }
                btnAction(position);
            }

        });

    }

    private void btnAction(int action) {
        switch (action) {
            case 0:
                _btn1.setImageResource(R.drawable.fill_circ_small_17);

                break;

            case 1:
                _btn2.setImageResource(R.drawable.fill_circ_small_17);

                break;
            case 2:
                _btn3.setImageResource(R.drawable.fill_circ_small_17);

                break;

            default:
                break;
        }
    }

    private void initButton() {
        _btn1 = (ImageView) getView().findViewById(R.id.btn1);
        _btn1.setImageResource(R.drawable.fill_circ_small_17);
        _btn2 = (ImageView) getView().findViewById(R.id.btn2);
        _btn3 = (ImageView) getView().findViewById(R.id.btn3);
        skip = (Button) getView().findViewById(R.id.btn_OnBoard_Skip);
    }

    private void setButton(Button btn, String text, int h, int w) {
        btn.setWidth(w);
        btn.setHeight(h);
        btn.setText(text);
    }

}
