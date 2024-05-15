// Generated by view binder compiler. Do not edit!
package com.example.mychatapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mychatapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGrupOlusturBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnGrupolustur;

  @NonNull
  public final EditText grupolusturAciklama;

  @NonNull
  public final EditText grupolusturGrupadi;

  @NonNull
  public final ImageView grupolusturSimge;

  @NonNull
  public final RecyclerView grupolusturTumgrup;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  private FragmentGrupOlusturBinding(@NonNull FrameLayout rootView, @NonNull Button btnGrupolustur,
      @NonNull EditText grupolusturAciklama, @NonNull EditText grupolusturGrupadi,
      @NonNull ImageView grupolusturSimge, @NonNull RecyclerView grupolusturTumgrup,
      @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12,
      @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8,
      @NonNull TextView textView9) {
    this.rootView = rootView;
    this.btnGrupolustur = btnGrupolustur;
    this.grupolusturAciklama = grupolusturAciklama;
    this.grupolusturGrupadi = grupolusturGrupadi;
    this.grupolusturSimge = grupolusturSimge;
    this.grupolusturTumgrup = grupolusturTumgrup;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGrupOlusturBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGrupOlusturBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_grup_olustur, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGrupOlusturBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_grupolustur;
      Button btnGrupolustur = ViewBindings.findChildViewById(rootView, id);
      if (btnGrupolustur == null) {
        break missingId;
      }

      id = R.id.grupolustur_aciklama;
      EditText grupolusturAciklama = ViewBindings.findChildViewById(rootView, id);
      if (grupolusturAciklama == null) {
        break missingId;
      }

      id = R.id.grupolustur_grupadi;
      EditText grupolusturGrupadi = ViewBindings.findChildViewById(rootView, id);
      if (grupolusturGrupadi == null) {
        break missingId;
      }

      id = R.id.grupolustur_simge;
      ImageView grupolusturSimge = ViewBindings.findChildViewById(rootView, id);
      if (grupolusturSimge == null) {
        break missingId;
      }

      id = R.id.grupolustur_tumgrup;
      RecyclerView grupolusturTumgrup = ViewBindings.findChildViewById(rootView, id);
      if (grupolusturTumgrup == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new FragmentGrupOlusturBinding((FrameLayout) rootView, btnGrupolustur,
          grupolusturAciklama, grupolusturGrupadi, grupolusturSimge, grupolusturTumgrup, textView10,
          textView11, textView12, textView6, textView7, textView8, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
