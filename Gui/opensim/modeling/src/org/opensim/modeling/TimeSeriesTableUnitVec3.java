/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimeSeriesTableUnitVec3 extends DataTableUnitVec3 {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected TimeSeriesTableUnitVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.TimeSeriesTableUnitVec3_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeSeriesTableUnitVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimModelCommonJNI.delete_TimeSeriesTableUnitVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeSeriesTableUnitVec3() {
    this(opensimModelCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_0(), true);
  }

  public TimeSeriesTableUnitVec3(TimeSeriesTableUnitVec3 arg0) {
    this(opensimModelCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_1(TimeSeriesTableUnitVec3.getCPtr(arg0), arg0), true);
  }

  public TimeSeriesTableUnitVec3(DataTableUnitVec3 datatable) {
    this(opensimModelCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_2(DataTableUnitVec3.getCPtr(datatable), datatable), true);
  }

  public TimeSeriesTableUnitVec3(String filename) {
    this(opensimModelCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_3(filename), true);
  }

  public TimeSeriesTableUnitVec3(String filename, String tablename) {
    this(opensimModelCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_4(filename, tablename), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t getNearestRow(double time, boolean restrictToTimeRange) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimModelCommonJNI.TimeSeriesTableUnitVec3_getNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t getNearestRow(double time) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimModelCommonJNI.TimeSeriesTableUnitVec3_getNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t updNearestRow(double time, boolean restrictToTimeRange) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimModelCommonJNI.TimeSeriesTableUnitVec3_updNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t updNearestRow(double time) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimModelCommonJNI.TimeSeriesTableUnitVec3_updNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t averageRow(double beginTime, double endTime) {
    return new SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t(opensimModelCommonJNI.TimeSeriesTableUnitVec3_averageRow(swigCPtr, this, beginTime, endTime), true);
  }

  public TimeSeriesTable flatten() {
    return new TimeSeriesTable(opensimModelCommonJNI.TimeSeriesTableUnitVec3_flatten__SWIG_0(swigCPtr, this), true);
  }

  public TimeSeriesTable flatten(StdVectorString suffixes) {
    return new TimeSeriesTable(opensimModelCommonJNI.TimeSeriesTableUnitVec3_flatten__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

}
