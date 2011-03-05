package frege.rt;
// $Author: ingo $
// $Date: 2011-02-26 12:48:55 +0100 (Sa, 26 Feb 2011) $
// $Rev: 217 $
// $Id: Fun26.java 217 2011-02-26 11:48:55Z ingo $
/**
 * <p> Frege functions with arity 26. </p>
 *
 * <p> See {@link Fun1} for a general discussion of function values. </p>
 *
 */
public abstract class Fun26<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27> implements Value, Lazy<Fun26<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27>> {
   /**
     * <p>Apply this function to an argument.</p>
     *
     * <p> This method creates an instance of {@link Fun25} that collects the
     * remaining arguments and, when evaluated, invokes the {@link Fun26#r} method of this
     * function.</p>
     *
     * @return an instance of type <tt>Fun25&lt;T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27&gt;</tt> that waits for the
     * remaining arguments to be supplied and calls back with all arguments.
     */
    final public Fun25<T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27> a(final Lazy<T1> arg1) {
        return new Fun25<T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27> () {
            final public Lazy<T27> r(final Lazy<T26> arg26,final Lazy<T25> arg25,final Lazy<T24> arg24,final Lazy<T23> arg23,final Lazy<T22> arg22,final Lazy<T21> arg21,final Lazy<T20> arg20,final Lazy<T19> arg19,final Lazy<T18> arg18,final Lazy<T17> arg17,final Lazy<T16> arg16,final Lazy<T15> arg15,final Lazy<T14> arg14,final Lazy<T13> arg13,final Lazy<T12> arg12,final Lazy<T11> arg11,final Lazy<T10> arg10,final Lazy<T9> arg9,final Lazy<T8> arg8,final Lazy<T7> arg7,final Lazy<T6> arg6,final Lazy<T5> arg5,final Lazy<T4> arg4,final Lazy<T3> arg3,final Lazy<T2> arg2) {
                return Fun26.this.r(arg26,arg25,arg24,arg23,arg22,arg21,arg20,arg19,arg18,arg17,arg16,arg15,arg14,arg13,arg12,arg11,arg10,arg9,arg8,arg7,arg6,arg5,arg4,arg3,arg2,arg1);
            }
        };
    }
    /**
     * <p>Apply this function to all its arguments at once.</p>
     *
     * <p> This method creates an instance of {@link Unknown} that,
     * when evaluated, invokes the {@link Fun26#r} method of this
     * function.</p>
     *
     * Use of this method is preferrable if all arguments are known compared
     * to repeated invokation of the single argument form since intermediate
     * closure creation is saved.
     *
     * @return an instance of type <tt>Unknown&lt;T27&gt;</tt>
     */
    final public Unknown<T27> a(final Lazy<T1> arg1,final Lazy<T2> arg2,final Lazy<T3> arg3,final Lazy<T4> arg4,final Lazy<T5> arg5,final Lazy<T6> arg6,final Lazy<T7> arg7,final Lazy<T8> arg8,final Lazy<T9> arg9,final Lazy<T10> arg10,final Lazy<T11> arg11,final Lazy<T12> arg12,final Lazy<T13> arg13,final Lazy<T14> arg14,final Lazy<T15> arg15,final Lazy<T16> arg16,final Lazy<T17> arg17,final Lazy<T18> arg18,final Lazy<T19> arg19,final Lazy<T20> arg20,final Lazy<T21> arg21,final Lazy<T22> arg22,final Lazy<T23> arg23,final Lazy<T24> arg24,final Lazy<T25> arg25,final Lazy<T26> arg26) {
        return new Unknown<T27> () {
            final public Lazy<T27> _v() { return Fun26.this.r(arg26,arg25,arg24,arg23,arg22,arg21,arg20,arg19,arg18,arg17,arg16,arg15,arg14,arg13,arg12,arg11,arg10,arg9,arg8,arg7,arg6,arg5,arg4,arg3,arg2,arg1); }
        };
    }
    /**
     * <p> Always <tt>0</tt> for function values. </p>
     * @return 0
     */
    final public int     _c() { return 0; }          // interface Value
    /**
     * <p> Return this function object. </p>
     * @return <tt>this</tt>
     */
    final public Fun26<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27> _e() { return this; }       // interface Lazy
    /**
     * <p> Return this function object. </p>
     * @return <tt>this</tt>
     */
    final public Fun26<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27> _v() { return this; }       // interface Lazy
    /**
     * <p> Always <tt>false</tt> for function values. </p>
     * @return <tt>false</tt>
     */
    final public boolean _u() { return false; }      // interface Lazy
    /**
     * <p> Run the function. </p>
     *
     * <p> The run method will be called by the {@link Fun25#r} method
     * of the function value resulting from <tt>this.a(...)</tt>.
     * It actually performs computation and
     * returns a result or another lazy value that will evaluate to the result.<br>
     * This method must be implemented by all subclasses.</p>
     *
     * <p>
     * Note that the arguments must be passed in reverse order. The reason is that
     * in this way the byte code for any intermediate closure will only have to
     * push its argument and invoke the next higher closure's <tt>r</tt> method.
     * A reordering of the arguments on the stack will not be needed. This could save
     * a substantial amounts of memory writes (I hope).
     * </p>
     *
     *
     * @return boxed and possibly lazy result
     */
    abstract public Lazy<T27> r(final Lazy<T26> arg26,final Lazy<T25> arg25,final Lazy<T24> arg24,final Lazy<T23> arg23,final Lazy<T22> arg22,final Lazy<T21> arg21,final Lazy<T20> arg20,final Lazy<T19> arg19,final Lazy<T18> arg18,final Lazy<T17> arg17,final Lazy<T16> arg16,final Lazy<T15> arg15,final Lazy<T14> arg14,final Lazy<T13> arg13,final Lazy<T12> arg12,final Lazy<T11> arg11,final Lazy<T10> arg10,final Lazy<T9> arg9,final Lazy<T8> arg8,final Lazy<T7> arg7,final Lazy<T6> arg6,final Lazy<T5> arg5,final Lazy<T4> arg4,final Lazy<T3> arg3,final Lazy<T2> arg2, Lazy<T1> arg1);
    /**
     * <p> Coerce the function to another type. </p>
     * <p> I see no other way to get around the limitations of the java type system, sorry.</p>
     * <p> This will be used in the case of constructor classes.</p>
     */
    @SuppressWarnings("unchecked") 
    public final <X1,X2,X3,X4,X5,X6,X7,X8,X9,X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20,X21,X22,X23,X24,X25,X26,X27> Fun26<X1,X2,X3,X4,X5,X6,X7,X8,X9,X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20,X21,X22,X23,X24,X25,X26,X27> coerce() { return (Fun26<X1,X2,X3,X4,X5,X6,X7,X8,X9,X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20,X21,X22,X23,X24,X25,X26,X27>) this; }
     
}
