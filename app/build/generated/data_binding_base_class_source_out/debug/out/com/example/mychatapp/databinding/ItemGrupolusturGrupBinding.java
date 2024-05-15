// Generated by view binder compiler. Do not edit!
package com.example.mychatapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mychatapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGrupolusturGrupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView grupolusturAciklama;

  @NonNull
  public final ImageView grupolusturImage;

  @NonNull
  public final TextView grupolusturIsim;

  private ItemGrupolusturGrupBinding(@NonNull LinearLayout rootView,
      @NonNull TextView grupolusturAciklama, @NonNull ImageView grupolusturImage,
      @NonNull TextView grupolusturIsim) {
    this.rootView = rootView;
    this.grupolusturAciklama = grupolusturAciklama;
    this.grupolusturImage = grupolusturImage;
    this.grupolusturIsim = grupolusturIsim;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGrupolusturGrupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGrupolusturGrupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_grupolustur_grup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGrupolusturGrupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.grupolustur_aciklama;
      TextView grupolusturAciklama = ViewBindings.findChildViewById(rootView, id);
      if (grupolusturAciklama == null) {
        break missingId;
      }

      id = R.id.grupolustur_image;
      ImageView grupolusturImage = ViewBindings.findChildViewById(rootView, id);
      if (grupolusturImage == null) {
        break missingId;
      }

      id = R.id.grupolustur_isim;
      TextView grupolusturIsim = ViewBindings.findChildViewById(rootView, id);
      if (grupolusturIsim == null) {
        break missingId;
      }

      return new ItemGrupolusturGrupBinding((LinearLayout) rootView, grupolusturAciklama,
          grupolusturImage, grupolusturIsim);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
