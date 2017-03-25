/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayPathPoint {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayPathPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayPathPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ArrayPathPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayPathPoint(AbstractPathPoint aDefaultValue, int aSize, int aCapacity) {
    this(opensimSimulationJNI.new_ArrayPathPoint__SWIG_0(AbstractPathPoint.getCPtr(aDefaultValue), aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayPathPoint(AbstractPathPoint aDefaultValue, int aSize) {
    this(opensimSimulationJNI.new_ArrayPathPoint__SWIG_1(AbstractPathPoint.getCPtr(aDefaultValue), aDefaultValue, aSize), true);
  }

  public ArrayPathPoint(AbstractPathPoint aDefaultValue) {
    this(opensimSimulationJNI.new_ArrayPathPoint__SWIG_2(AbstractPathPoint.getCPtr(aDefaultValue), aDefaultValue), true);
  }

  public ArrayPathPoint() {
    this(opensimSimulationJNI.new_ArrayPathPoint__SWIG_3(), true);
  }

  public ArrayPathPoint(ArrayPathPoint aArray) {
    this(opensimSimulationJNI.new_ArrayPathPoint__SWIG_4(ArrayPathPoint.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayPathPoint aArray) {
    return opensimSimulationJNI.ArrayPathPoint_arrayEquals(swigCPtr, this, ArrayPathPoint.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimSimulationJNI.ArrayPathPoint_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.ArrayPathPoint_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.ArrayPathPoint_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimSimulationJNI.ArrayPathPoint_size(swigCPtr, this);
  }

  public int append(AbstractPathPoint aValue) {
    return opensimSimulationJNI.ArrayPathPoint_append__SWIG_0(swigCPtr, this, AbstractPathPoint.getCPtr(aValue), aValue);
  }

  public int append(ArrayPathPoint aArray) {
    return opensimSimulationJNI.ArrayPathPoint_append__SWIG_1(swigCPtr, this, ArrayPathPoint.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, AbstractPathPoint aValue) {
    return opensimSimulationJNI.ArrayPathPoint_insert(swigCPtr, this, aIndex, AbstractPathPoint.getCPtr(aValue), aValue);
  }

  public int remove(int aIndex) {
    return opensimSimulationJNI.ArrayPathPoint_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, AbstractPathPoint aValue) {
    opensimSimulationJNI.ArrayPathPoint_set(swigCPtr, this, aIndex, AbstractPathPoint.getCPtr(aValue), aValue);
  }

  public AbstractPathPoint get(int aIndex) {
    long cPtr = opensimSimulationJNI.ArrayPathPoint_get(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new AbstractPathPoint(cPtr, false);
  }

  public AbstractPathPoint getitem(int index) {
    long cPtr = opensimSimulationJNI.ArrayPathPoint_getitem(swigCPtr, this, index);
    return (cPtr == 0) ? null : new AbstractPathPoint(cPtr, false);
  }

  public void setitem(int index, AbstractPathPoint val) {
    opensimSimulationJNI.ArrayPathPoint_setitem(swigCPtr, this, index, AbstractPathPoint.getCPtr(val), val);
  }

  public AbstractPathPoint getLast() {
    long cPtr = opensimSimulationJNI.ArrayPathPoint_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractPathPoint(cPtr, false);
  }

  public int findIndex(AbstractPathPoint aValue) {
    return opensimSimulationJNI.ArrayPathPoint_findIndex(swigCPtr, this, AbstractPathPoint.getCPtr(aValue), aValue);
  }

  public int rfindIndex(AbstractPathPoint aValue) {
    return opensimSimulationJNI.ArrayPathPoint_rfindIndex(swigCPtr, this, AbstractPathPoint.getCPtr(aValue), aValue);
  }

  public int searchBinary(AbstractPathPoint aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimSimulationJNI.ArrayPathPoint_searchBinary__SWIG_0(swigCPtr, this, AbstractPathPoint.getCPtr(aValue), aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(AbstractPathPoint aValue, boolean aFindFirst, int aLo) {
    return opensimSimulationJNI.ArrayPathPoint_searchBinary__SWIG_1(swigCPtr, this, AbstractPathPoint.getCPtr(aValue), aValue, aFindFirst, aLo);
  }

  public int searchBinary(AbstractPathPoint aValue, boolean aFindFirst) {
    return opensimSimulationJNI.ArrayPathPoint_searchBinary__SWIG_2(swigCPtr, this, AbstractPathPoint.getCPtr(aValue), aValue, aFindFirst);
  }

  public int searchBinary(AbstractPathPoint aValue) {
    return opensimSimulationJNI.ArrayPathPoint_searchBinary__SWIG_3(swigCPtr, this, AbstractPathPoint.getCPtr(aValue), aValue);
  }

}
