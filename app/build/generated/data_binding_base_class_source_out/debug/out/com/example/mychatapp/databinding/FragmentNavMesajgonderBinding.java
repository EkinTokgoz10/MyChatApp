// Generated by view binder compiler. Do not edit!
package com.example.mychatapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mychatapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNavMesajgonderBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView textMesajgonder;

  @NonNull
  public final TextView textMesajgonder2;

  @NonNull
  public final TextView textMesajgonder3;

  private FragmentNavMesajgonderBinding(@NonNull FrameLayout rootView,
      @NonNull TextView textMesajgonder, @NonNull TextView textMesajgonder2,
      @NonNull TextView textMesajgonder3) {
    this.rootView = rootView;
    this.textMesajgonder = textMesajgonder;
    this.textMesajgonder2 = textMesajgonder2;
    this.textMesajgonder3 = textMesajgonder3;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNavMesajgonderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNavMesajgonderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_nav_mesajgonder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNavMesajgonderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.text_mesajgonder;
      TextView textMesajgonder = ViewBindings.findChildViewById(rootView, id);
      if (textMesajgonder == null) {
        break missingId;
      }

      id = R.id.text_mesajgonder2;
      TextView textMesajgonder2 = ViewBindings.findChildViewById(rootView, id);
      if (textMesajgonder2 == null) {
        break missingId;
      }

      id = R.id.text_mesajgonder3;
      TextView textMesajgonder3 = ViewBindings.findChildViewById(rootView, id);
      if (textMesajgonder3 == null) {
        break missingId;
      }

      return new FragmentNavMesajgonderBinding((FrameLayout) rootView, textMesajgonder,
          textMesajgonder2, textMesajgonder3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
