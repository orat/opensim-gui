/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleAnalysis extends Analysis {
  private transient long swigCPtr;

  public MuscleAnalysis(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleAnalysis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_MuscleAnalysis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MuscleAnalysis safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MuscleAnalysis(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MuscleAnalysis(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getConcreteClassName(swigCPtr, this);
  }

  public MuscleAnalysis(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_MuscleAnalysis__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public MuscleAnalysis() {
    this(opensimActuatorsAnalysesToolsJNI.new_MuscleAnalysis__SWIG_1(), true);
  }

  public MuscleAnalysis(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_MuscleAnalysis__SWIG_2(aFileName), true);
  }

  public MuscleAnalysis(MuscleAnalysis aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_MuscleAnalysis__SWIG_3(MuscleAnalysis.getCPtr(aObject), aObject), true);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setStorageCapacityIncrements(int aIncrement) {
    opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_setStorageCapacityIncrements(swigCPtr, this, aIncrement);
  }

  public Storage getPennationAngleStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getPennationAngleStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getMuscleTendonLengthStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getMuscleTendonLengthStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getFiberLengthStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getFiberLengthStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getNormalizedFiberLengthStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getNormalizedFiberLengthStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getTendonLengthStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getTendonLengthStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getFiberVelocityStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getFiberVelocityStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getNormalizedFiberVelocityStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getNormalizedFiberVelocityStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getPennationAngularVelocityStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getPennationAngularVelocityStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getForceStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getForceStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getFiberForceStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getFiberForceStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getActiveFiberForceStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getActiveFiberForceStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getPassiveFiberForceStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getPassiveFiberForceStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getActiveFiberForceAlongTendonStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getActiveFiberForceAlongTendonStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getPassiveFiberForceAlongTendonStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getPassiveFiberForceAlongTendonStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getFiberActivePowerStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getFiberActivePowerStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getFiberPassivePowerStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getFiberPassivePowerStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getTendonPowerStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getTendonPowerStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getMusclePowerStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getMusclePowerStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public void setMuscles(ArrayStr aMuscles) {
    opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_setMuscles(swigCPtr, this, ArrayStr.getCPtr(aMuscles), aMuscles);
  }

  public void setCoordinates(ArrayStr aCoordinates) {
    opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_setCoordinates(swigCPtr, this, ArrayStr.getCPtr(aCoordinates), aCoordinates);
  }

  public void setComputeMoments(boolean aTrueFalse) {
    opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_setComputeMoments(swigCPtr, this, aTrueFalse);
  }

  public boolean getComputeMoments() {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_getComputeMoments(swigCPtr, this);
  }

  public int begin(State s) {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

  public void allocateStorageObjects() {
    opensimActuatorsAnalysesToolsJNI.MuscleAnalysis_allocateStorageObjects(swigCPtr, this);
  }

}
