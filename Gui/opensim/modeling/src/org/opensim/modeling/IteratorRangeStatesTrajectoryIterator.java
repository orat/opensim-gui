/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IteratorRangeStatesTrajectoryIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public IteratorRangeStatesTrajectoryIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(IteratorRangeStatesTrajectoryIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_IteratorRangeStatesTrajectoryIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IteratorRangeStatesTrajectoryIterator(SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator first, SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator last) {
    this(opensimSimulationJNI.new_IteratorRangeStatesTrajectoryIterator__SWIG_0(SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator.getCPtr(first), SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator.getCPtr(last)), true);
  }

  public IteratorRangeStatesTrajectoryIterator(SWIGTYPE_p_std__pairT_std__vectorT_SimTK__State_t__const_iterator_std__vectorT_SimTK__State_t__const_iterator_t range) {
    this(opensimSimulationJNI.new_IteratorRangeStatesTrajectoryIterator__SWIG_1(SWIGTYPE_p_std__pairT_std__vectorT_SimTK__State_t__const_iterator_std__vectorT_SimTK__State_t__const_iterator_t.getCPtr(range)), true);
  }

  public SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator begin() {
    return new SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator(opensimSimulationJNI.IteratorRangeStatesTrajectoryIterator_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator end() {
    return new SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator(opensimSimulationJNI.IteratorRangeStatesTrajectoryIterator_end(swigCPtr, this), true);
  }

}
