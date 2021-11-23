// Generated by data binding compiler. Do not edit!
package com.example.cupcake.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.cupcake.PickupFragment;
import com.example.cupcake.R;
import com.example.cupcake.model.OrderViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPickupBinding extends ViewDataBinding {
  @NonNull
  public final RadioGroup dateOptions;

  @NonNull
  public final View divider;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final RadioButton option0;

  @NonNull
  public final RadioButton option1;

  @NonNull
  public final RadioButton option2;

  @NonNull
  public final RadioButton option3;

  @NonNull
  public final TextView subtotal;

  @Bindable
  protected OrderViewModel mViewModel;

  @Bindable
  protected PickupFragment mPickupFragment;

  protected FragmentPickupBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RadioGroup dateOptions, View divider, Button nextButton, RadioButton option0,
      RadioButton option1, RadioButton option2, RadioButton option3, TextView subtotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dateOptions = dateOptions;
    this.divider = divider;
    this.nextButton = nextButton;
    this.option0 = option0;
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.subtotal = subtotal;
  }

  public abstract void setViewModel(@Nullable OrderViewModel viewModel);

  @Nullable
  public OrderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setPickupFragment(@Nullable PickupFragment pickupFragment);

  @Nullable
  public PickupFragment getPickupFragment() {
    return mPickupFragment;
  }

  @NonNull
  public static FragmentPickupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_pickup, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPickupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPickupBinding>inflateInternal(inflater, R.layout.fragment_pickup, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPickupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_pickup, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPickupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPickupBinding>inflateInternal(inflater, R.layout.fragment_pickup, null, false, component);
  }

  public static FragmentPickupBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentPickupBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPickupBinding)bind(component, view, R.layout.fragment_pickup);
  }
}