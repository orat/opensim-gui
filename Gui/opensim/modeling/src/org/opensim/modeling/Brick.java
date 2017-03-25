/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Brick extends Geometry {
  private transient long swigCPtr;

  public Brick(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Brick_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Brick obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Brick(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Brick safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Brick_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Brick(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Brick_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Brick_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Brick_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Brick(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Brick_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_half_lengths(Brick source) {
    opensimSimulationJNI.Brick_copyProperty_half_lengths(swigCPtr, this, Brick.getCPtr(source), source);
  }

  public Vec3 get_half_lengths(int i) {
    return new Vec3(opensimSimulationJNI.Brick_get_half_lengths__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_half_lengths(int i) {
    return new Vec3(opensimSimulationJNI.Brick_upd_half_lengths__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_half_lengths(int i, Vec3 value) {
    opensimSimulationJNI.Brick_set_half_lengths__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_half_lengths(Vec3 value) {
    return opensimSimulationJNI.Brick_append_half_lengths(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_half_lengths(Vec3 initValue) {
    opensimSimulationJNI.Brick_constructProperty_half_lengths(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_half_lengths() {
    return new Vec3(opensimSimulationJNI.Brick_get_half_lengths__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_half_lengths() {
    return new Vec3(opensimSimulationJNI.Brick_upd_half_lengths__SWIG_1(swigCPtr, this), false);
  }

  public void set_half_lengths(Vec3 value) {
    opensimSimulationJNI.Brick_set_half_lengths__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public Brick() {
    this(opensimSimulationJNI.new_Brick__SWIG_0(), true);
  }

  public Brick(Vec3 halfLengths) {
    this(opensimSimulationJNI.new_Brick__SWIG_1(Vec3.getCPtr(halfLengths), halfLengths), true);
  }

}
