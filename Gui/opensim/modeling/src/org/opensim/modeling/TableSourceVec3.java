/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TableSourceVec3 extends Component {
  private transient long swigCPtr;

  public TableSourceVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TableSourceVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableSourceVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_TableSourceVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TableSourceVec3 safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.TableSourceVec3_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TableSourceVec3(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.TableSourceVec3_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.TableSourceVec3_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.TableSourceVec3_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TableSourceVec3(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.TableSourceVec3_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_filename(TableSourceVec3 source) {
    opensimCommonJNI.TableSourceVec3_copyProperty_filename(swigCPtr, this, TableSourceVec3.getCPtr(source), source);
  }

  public String get_filename(int i) {
    return opensimCommonJNI.TableSourceVec3_get_filename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_filename(int i) {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSourceVec3_upd_filename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_filename(int i, String value) {
    opensimCommonJNI.TableSourceVec3_set_filename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_filename(String value) {
    return opensimCommonJNI.TableSourceVec3_append_filename(swigCPtr, this, value);
  }

  public void constructProperty_filename(String initValue) {
    opensimCommonJNI.TableSourceVec3_constructProperty_filename(swigCPtr, this, initValue);
  }

  public String get_filename() {
    return opensimCommonJNI.TableSourceVec3_get_filename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_filename() {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSourceVec3_upd_filename__SWIG_1(swigCPtr, this), false);
  }

  public void set_filename(String value) {
    opensimCommonJNI.TableSourceVec3_set_filename__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_tablename(TableSourceVec3 source) {
    opensimCommonJNI.TableSourceVec3_copyProperty_tablename(swigCPtr, this, TableSourceVec3.getCPtr(source), source);
  }

  public String get_tablename(int i) {
    return opensimCommonJNI.TableSourceVec3_get_tablename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_tablename(int i) {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSourceVec3_upd_tablename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_tablename(int i, String value) {
    opensimCommonJNI.TableSourceVec3_set_tablename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_tablename(String value) {
    return opensimCommonJNI.TableSourceVec3_append_tablename(swigCPtr, this, value);
  }

  public void constructProperty_tablename(String initValue) {
    opensimCommonJNI.TableSourceVec3_constructProperty_tablename(swigCPtr, this, initValue);
  }

  public String get_tablename() {
    return opensimCommonJNI.TableSourceVec3_get_tablename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_tablename() {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSourceVec3_upd_tablename__SWIG_1(swigCPtr, this), false);
  }

  public void set_tablename(String value) {
    opensimCommonJNI.TableSourceVec3_set_tablename__SWIG_1(swigCPtr, this, value);
  }

  public void set_has_output_all_columns(boolean value) {
    opensimCommonJNI.TableSourceVec3__has_output_all_columns_set(swigCPtr, this, value);
  }

  public boolean get_has_output_all_columns() {
    return opensimCommonJNI.TableSourceVec3__has_output_all_columns_get(swigCPtr, this);
  }

  public void set_has_output_column(boolean value) {
    opensimCommonJNI.TableSourceVec3__has_output_column_set(swigCPtr, this, value);
  }

  public boolean get_has_output_column() {
    return opensimCommonJNI.TableSourceVec3__has_output_column_get(swigCPtr, this);
  }

  public TableSourceVec3() {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_0(), true);
  }

  public TableSourceVec3(TableSourceVec3 arg0) {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_1(TableSourceVec3.getCPtr(arg0), arg0), true);
  }

  public TableSourceVec3(TimeSeriesTableVec3 table) {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_2(TimeSeriesTableVec3.getCPtr(table), table), true);
  }

  public TableSourceVec3(String filename) {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_3(filename), true);
  }

  public TableSourceVec3(String filename, String tablename) {
    this(opensimCommonJNI.new_TableSourceVec3__SWIG_4(filename, tablename), true);
  }

  public TimeSeriesTableVec3 getTable() {
    return new TimeSeriesTableVec3(opensimCommonJNI.TableSourceVec3_getTable(swigCPtr, this), true);
  }

  public void setTable(TimeSeriesTableVec3 table) {
    opensimCommonJNI.TableSourceVec3_setTable__SWIG_0(swigCPtr, this, TimeSeriesTableVec3.getCPtr(table), table);
  }

  public void setTable(String filename) {
    opensimCommonJNI.TableSourceVec3_setTable__SWIG_1(swigCPtr, this, filename);
  }

  public void setTable(String filename, String tablename) {
    opensimCommonJNI.TableSourceVec3_setTable__SWIG_2(swigCPtr, this, filename, tablename);
  }

}
