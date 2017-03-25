/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathWrap extends ModelComponent {
  private transient long swigCPtr;

  public PathWrap(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PathWrap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathWrap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_PathWrap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathWrap safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PathWrap_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathWrap(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PathWrap_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PathWrap_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PathWrap_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathWrap(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PathWrap_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_wrap_object(PathWrap source) {
    opensimSimulationJNI.PathWrap_copyProperty_wrap_object(swigCPtr, this, PathWrap.getCPtr(source), source);
  }

  public String get_wrap_object(int i) {
    return opensimSimulationJNI.PathWrap_get_wrap_object__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_wrap_object(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.PathWrap_upd_wrap_object__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_wrap_object(int i, String value) {
    opensimSimulationJNI.PathWrap_set_wrap_object__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_wrap_object(String value) {
    return opensimSimulationJNI.PathWrap_append_wrap_object(swigCPtr, this, value);
  }

  public void constructProperty_wrap_object(String initValue) {
    opensimSimulationJNI.PathWrap_constructProperty_wrap_object(swigCPtr, this, initValue);
  }

  public String get_wrap_object() {
    return opensimSimulationJNI.PathWrap_get_wrap_object__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_wrap_object() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.PathWrap_upd_wrap_object__SWIG_1(swigCPtr, this), false);
  }

  public void set_wrap_object(String value) {
    opensimSimulationJNI.PathWrap_set_wrap_object__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_method(PathWrap source) {
    opensimSimulationJNI.PathWrap_copyProperty_method(swigCPtr, this, PathWrap.getCPtr(source), source);
  }

  public String get_method(int i) {
    return opensimSimulationJNI.PathWrap_get_method__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_method(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.PathWrap_upd_method__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_method(int i, String value) {
    opensimSimulationJNI.PathWrap_set_method__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_method(String value) {
    return opensimSimulationJNI.PathWrap_append_method(swigCPtr, this, value);
  }

  public void constructProperty_method(String initValue) {
    opensimSimulationJNI.PathWrap_constructProperty_method(swigCPtr, this, initValue);
  }

  public String get_method() {
    return opensimSimulationJNI.PathWrap_get_method__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_method() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.PathWrap_upd_method__SWIG_1(swigCPtr, this), false);
  }

  public void set_method(String value) {
    opensimSimulationJNI.PathWrap_set_method__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_range(PathWrap source) {
    opensimSimulationJNI.PathWrap_copyProperty_range(swigCPtr, this, PathWrap.getCPtr(source), source);
  }

  public int get_range(int i) {
    return opensimSimulationJNI.PathWrap_get_range(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_range(int i) {
    return new SWIGTYPE_p_int(opensimSimulationJNI.PathWrap_upd_range(swigCPtr, this, i), false);
  }

  public void set_range(int i, int value) {
    opensimSimulationJNI.PathWrap_set_range(swigCPtr, this, i, value);
  }

  public int append_range(int value) {
    return opensimSimulationJNI.PathWrap_append_range(swigCPtr, this, value);
  }

  public PathWrap() {
    this(opensimSimulationJNI.new_PathWrap(), true);
  }

  public int getStartPoint() {
    return opensimSimulationJNI.PathWrap_getStartPoint(swigCPtr, this);
  }

  public int getEndPoint() {
    return opensimSimulationJNI.PathWrap_getEndPoint(swigCPtr, this);
  }

  public String getWrapObjectName() {
    return opensimSimulationJNI.PathWrap_getWrapObjectName(swigCPtr, this);
  }

  public WrapObject getWrapObject() {
    long cPtr = opensimSimulationJNI.PathWrap_getWrapObject(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public void setWrapObject(WrapObject aWrapObject) {
    opensimSimulationJNI.PathWrap_setWrapObject(swigCPtr, this, WrapObject.getCPtr(aWrapObject), aWrapObject);
  }

  public SWIGTYPE_p_PathWrapPoint getWrapPoint1() {
    return new SWIGTYPE_p_PathWrapPoint(opensimSimulationJNI.PathWrap_getWrapPoint1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_PathWrapPoint getWrapPoint2() {
    return new SWIGTYPE_p_PathWrapPoint(opensimSimulationJNI.PathWrap_getWrapPoint2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_PathWrapPoint updWrapPoint1() {
    return new SWIGTYPE_p_PathWrapPoint(opensimSimulationJNI.PathWrap_updWrapPoint1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_PathWrapPoint updWrapPoint2() {
    return new SWIGTYPE_p_PathWrapPoint(opensimSimulationJNI.PathWrap_updWrapPoint2(swigCPtr, this), false);
  }

  public PathWrap.WrapMethod getMethod() {
    return PathWrap.WrapMethod.swigToEnum(opensimSimulationJNI.PathWrap_getMethod(swigCPtr, this));
  }

  public void setMethod(PathWrap.WrapMethod aMethod) {
    opensimSimulationJNI.PathWrap_setMethod(swigCPtr, this, aMethod.swigValue());
  }

  public String getMethodName() {
    return opensimSimulationJNI.PathWrap_getMethodName(swigCPtr, this);
  }

  public SWIGTYPE_p_OpenSim__WrapResult getPreviousWrap() {
    return new SWIGTYPE_p_OpenSim__WrapResult(opensimSimulationJNI.PathWrap_getPreviousWrap(swigCPtr, this), false);
  }

  public void setPreviousWrap(SWIGTYPE_p_OpenSim__WrapResult aWrapResult) {
    opensimSimulationJNI.PathWrap_setPreviousWrap(swigCPtr, this, SWIGTYPE_p_OpenSim__WrapResult.getCPtr(aWrapResult));
  }

  public void resetPreviousWrap() {
    opensimSimulationJNI.PathWrap_resetPreviousWrap(swigCPtr, this);
  }

  public final static class WrapMethod {
    public final static PathWrap.WrapMethod hybrid = new PathWrap.WrapMethod("hybrid");
    public final static PathWrap.WrapMethod midpoint = new PathWrap.WrapMethod("midpoint");
    public final static PathWrap.WrapMethod axial = new PathWrap.WrapMethod("axial");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static WrapMethod swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + WrapMethod.class + " with value " + swigValue);
    }

    private WrapMethod(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private WrapMethod(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private WrapMethod(String swigName, WrapMethod swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static WrapMethod[] swigValues = { hybrid, midpoint, axial };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
