/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetWrapObject extends OpenSimObject {
  private transient long swigCPtr;

  public SetWrapObject(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetWrapObject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetWrapObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetWrapObject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetWrapObject safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetWrapObject_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetWrapObject(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetWrapObject_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetWrapObject_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetWrapObject_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetWrapObject(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetWrapObject_getConcreteClassName(swigCPtr, this);
  }

  public SetWrapObject() {
    this(opensimSimulationJNI.new_SetWrapObject__SWIG_0(), true);
  }

  public SetWrapObject(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_SetWrapObject__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetWrapObject(String aFileName) {
    this(opensimSimulationJNI.new_SetWrapObject__SWIG_2(aFileName), true);
  }

  public SetWrapObject(SetWrapObject aSet) {
    this(opensimSimulationJNI.new_SetWrapObject__SWIG_3(SetWrapObject.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetWrapObject_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetWrapObject_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetWrapObject_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetWrapObject_getSize(swigCPtr, this);
  }

  public int getIndex(WrapObject aObject, int aStartIndex) {
    return opensimSimulationJNI.SetWrapObject_getIndex__SWIG_0(swigCPtr, this, WrapObject.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(WrapObject aObject) {
    return opensimSimulationJNI.SetWrapObject_getIndex__SWIG_1(swigCPtr, this, WrapObject.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetWrapObject_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetWrapObject_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetWrapObject_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(WrapObject aObject) {
    return opensimSimulationJNI.SetWrapObject_adoptAndAppend(swigCPtr, this, WrapObject.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(WrapObject aObject) {
    return opensimSimulationJNI.SetWrapObject_cloneAndAppend(swigCPtr, this, WrapObject.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, WrapObject aObject) {
    return opensimSimulationJNI.SetWrapObject_insert(swigCPtr, this, aIndex, WrapObject.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetWrapObject_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(WrapObject aObject) {
    return opensimSimulationJNI.SetWrapObject_remove__SWIG_1(swigCPtr, this, WrapObject.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetWrapObject_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, WrapObject aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetWrapObject_set__SWIG_0(swigCPtr, this, aIndex, WrapObject.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, WrapObject aObject) {
    return opensimSimulationJNI.SetWrapObject_set__SWIG_1(swigCPtr, this, aIndex, WrapObject.getCPtr(aObject), aObject);
  }

  public WrapObject get(int aIndex) {
    return new WrapObject(opensimSimulationJNI.SetWrapObject_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public WrapObject get(String aName) {
    return new WrapObject(opensimSimulationJNI.SetWrapObject_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetWrapObject_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetWrapObject_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetWrapObject_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetWrapObject_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetWrapObject_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetWrapObject_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetWrapObject_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetWrapObject_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetWrapObject_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetWrapObject_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
