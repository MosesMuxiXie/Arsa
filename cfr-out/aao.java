/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.util.Function10
 *  com.mojang.datafixers.util.Function11
 *  com.mojang.datafixers.util.Function12
 *  com.mojang.datafixers.util.Function3
 *  com.mojang.datafixers.util.Function4
 *  com.mojang.datafixers.util.Function5
 *  com.mojang.datafixers.util.Function6
 *  com.mojang.datafixers.util.Function7
 *  com.mojang.datafixers.util.Function8
 *  com.mojang.datafixers.util.Function9
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Function10;
import com.mojang.datafixers.util.Function11;
import com.mojang.datafixers.util.Function12;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import com.mojang.datafixers.util.Function6;
import com.mojang.datafixers.util.Function7;
import com.mojang.datafixers.util.Function8;
import com.mojang.datafixers.util.Function9;
import io.netty.buffer.ByteBuf;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public interface aao<B, V>
extends aap<B, V>,
aaq<B, V> {
    public static <B, V> aao<B, V> a(final aaq<B, V> $$0, final aap<B, V> $$1) {
        return new aao<B, V>(){

            @Override
            public V decode(B $$02) {
                return $$1.decode($$02);
            }

            @Override
            public void encode(B $$02, V $$12) {
                $$0.encode($$02, $$12);
            }
        };
    }

    public static <B, V> aao<B, V> a(final aar<B, V> $$0, final aap<B, V> $$1) {
        return new aao<B, V>(){

            @Override
            public V decode(B $$02) {
                return $$1.decode($$02);
            }

            @Override
            public void encode(B $$02, V $$12) {
                $$0.encode($$12, $$02);
            }
        };
    }

    public static <B, V> aao<B, V> a(final V $$0) {
        return new aao<B, V>(){

            @Override
            public V decode(B $$02) {
                return $$0;
            }

            @Override
            public void encode(B $$02, V $$1) {
                if (!$$1.equals($$0)) {
                    throw new IllegalStateException("Can't encode '" + String.valueOf($$1) + "', expected '" + String.valueOf($$0) + "'");
                }
            }
        };
    }

    default public <O> aao<B, O> a(a<B, V, O> $$0) {
        return $$0.apply(this);
    }

    default public <O> aao<B, O> a(final Function<? super V, ? extends O> $$0, final Function<? super O, ? extends V> $$1) {
        return new aao<B, O>(){

            @Override
            public O decode(B $$02) {
                return $$0.apply(aao.this.decode($$02));
            }

            @Override
            public void encode(B $$02, O $$12) {
                aao.this.encode($$02, $$1.apply($$12));
            }
        };
    }

    default public <O extends ByteBuf> aao<O, V> b(final Function<O, ? extends B> $$0) {
        return new aao<O, V>(){

            public V a(O $$02) {
                Object $$1 = $$0.apply($$02);
                return aao.this.decode($$1);
            }

            public void a(O $$02, V $$1) {
                Object $$2 = $$0.apply($$02);
                aao.this.encode($$2, $$1);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    default public <U> aao<B, U> b(final Function<? super U, ? extends V> $$0, final Function<? super V, ? extends aao<? super B, ? extends U>> $$1) {
        return new aao<B, U>(){

            @Override
            public U decode(B $$02) {
                Object $$12 = aao.this.decode($$02);
                aao $$2 = (aao)$$1.apply($$12);
                return $$2.decode($$02);
            }

            @Override
            public void encode(B $$02, U $$12) {
                Object $$2 = $$0.apply($$12);
                aao $$3 = (aao)$$1.apply($$2);
                aao.this.encode($$02, $$2);
                $$3.encode($$02, $$12);
            }
        };
    }

    public static <B, C, T1> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final Function<T1, C> $$2) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$12 = $$0.decode($$02);
                return $$2.apply($$12);
            }

            @Override
            public void encode(B $$02, C $$12) {
                $$0.encode($$02, $$1.apply($$12));
            }
        };
    }

    public static <B, C, T1, T2> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final BiFunction<T1, T2, C> $$4) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$12 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                return $$4.apply($$12, $$22);
            }

            @Override
            public void encode(B $$02, C $$12) {
                $$0.encode($$02, $$1.apply($$12));
                $$2.encode($$02, $$3.apply($$12));
            }
        };
    }

    public static <B, C, T1, T2, T3> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final Function3<T1, T2, T3, C> $$6) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$12 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                return $$6.apply($$12, $$22, $$32);
            }

            @Override
            public void encode(B $$02, C $$12) {
                $$0.encode($$02, $$1.apply($$12));
                $$2.encode($$02, $$3.apply($$12));
                $$4.encode($$02, $$5.apply($$12));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final Function4<T1, T2, T3, T4, C> $$8) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$12 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                return $$8.apply($$12, $$22, $$32, $$42);
            }

            @Override
            public void encode(B $$02, C $$12) {
                $$0.encode($$02, $$1.apply($$12));
                $$2.encode($$02, $$3.apply($$12));
                $$4.encode($$02, $$5.apply($$12));
                $$6.encode($$02, $$7.apply($$12));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4, T5> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final aao<? super B, T5> $$8, final Function<C, T5> $$9, final Function5<T1, T2, T3, T4, T5, C> $$10) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$12 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                Object $$52 = $$8.decode($$02);
                return $$10.apply($$12, $$22, $$32, $$42, $$52);
            }

            @Override
            public void encode(B $$02, C $$12) {
                $$0.encode($$02, $$1.apply($$12));
                $$2.encode($$02, $$3.apply($$12));
                $$4.encode($$02, $$5.apply($$12));
                $$6.encode($$02, $$7.apply($$12));
                $$8.encode($$02, $$9.apply($$12));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4, T5, T6> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final aao<? super B, T5> $$8, final Function<C, T5> $$9, final aao<? super B, T6> $$10, final Function<C, T6> $$11, final Function6<T1, T2, T3, T4, T5, T6, C> $$12) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$13 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                Object $$52 = $$8.decode($$02);
                Object $$62 = $$10.decode($$02);
                return $$12.apply($$13, $$22, $$32, $$42, $$52, $$62);
            }

            @Override
            public void encode(B $$02, C $$13) {
                $$0.encode($$02, $$1.apply($$13));
                $$2.encode($$02, $$3.apply($$13));
                $$4.encode($$02, $$5.apply($$13));
                $$6.encode($$02, $$7.apply($$13));
                $$8.encode($$02, $$9.apply($$13));
                $$10.encode($$02, $$11.apply($$13));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final aao<? super B, T5> $$8, final Function<C, T5> $$9, final aao<? super B, T6> $$10, final Function<C, T6> $$11, final aao<? super B, T7> $$12, final Function<C, T7> $$13, final Function7<T1, T2, T3, T4, T5, T6, T7, C> $$14) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$15 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                Object $$52 = $$8.decode($$02);
                Object $$62 = $$10.decode($$02);
                Object $$72 = $$12.decode($$02);
                return $$14.apply($$15, $$22, $$32, $$42, $$52, $$62, $$72);
            }

            @Override
            public void encode(B $$02, C $$15) {
                $$0.encode($$02, $$1.apply($$15));
                $$2.encode($$02, $$3.apply($$15));
                $$4.encode($$02, $$5.apply($$15));
                $$6.encode($$02, $$7.apply($$15));
                $$8.encode($$02, $$9.apply($$15));
                $$10.encode($$02, $$11.apply($$15));
                $$12.encode($$02, $$13.apply($$15));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final aao<? super B, T5> $$8, final Function<C, T5> $$9, final aao<? super B, T6> $$10, final Function<C, T6> $$11, final aao<? super B, T7> $$12, final Function<C, T7> $$13, final aao<? super B, T8> $$14, final Function<C, T8> $$15, final Function8<T1, T2, T3, T4, T5, T6, T7, T8, C> $$16) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$17 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                Object $$52 = $$8.decode($$02);
                Object $$62 = $$10.decode($$02);
                Object $$72 = $$12.decode($$02);
                Object $$82 = $$14.decode($$02);
                return $$16.apply($$17, $$22, $$32, $$42, $$52, $$62, $$72, $$82);
            }

            @Override
            public void encode(B $$02, C $$17) {
                $$0.encode($$02, $$1.apply($$17));
                $$2.encode($$02, $$3.apply($$17));
                $$4.encode($$02, $$5.apply($$17));
                $$6.encode($$02, $$7.apply($$17));
                $$8.encode($$02, $$9.apply($$17));
                $$10.encode($$02, $$11.apply($$17));
                $$12.encode($$02, $$13.apply($$17));
                $$14.encode($$02, $$15.apply($$17));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final aao<? super B, T5> $$8, final Function<C, T5> $$9, final aao<? super B, T6> $$10, final Function<C, T6> $$11, final aao<? super B, T7> $$12, final Function<C, T7> $$13, final aao<? super B, T8> $$14, final Function<C, T8> $$15, final aao<? super B, T9> $$16, final Function<C, T9> $$17, final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, C> $$18) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$19 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                Object $$52 = $$8.decode($$02);
                Object $$62 = $$10.decode($$02);
                Object $$72 = $$12.decode($$02);
                Object $$82 = $$14.decode($$02);
                Object $$92 = $$16.decode($$02);
                return $$18.apply($$19, $$22, $$32, $$42, $$52, $$62, $$72, $$82, $$92);
            }

            @Override
            public void encode(B $$02, C $$19) {
                $$0.encode($$02, $$1.apply($$19));
                $$2.encode($$02, $$3.apply($$19));
                $$4.encode($$02, $$5.apply($$19));
                $$6.encode($$02, $$7.apply($$19));
                $$8.encode($$02, $$9.apply($$19));
                $$10.encode($$02, $$11.apply($$19));
                $$12.encode($$02, $$13.apply($$19));
                $$14.encode($$02, $$15.apply($$19));
                $$16.encode($$02, $$17.apply($$19));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final aao<? super B, T5> $$8, final Function<C, T5> $$9, final aao<? super B, T6> $$10, final Function<C, T6> $$11, final aao<? super B, T7> $$12, final Function<C, T7> $$13, final aao<? super B, T8> $$14, final Function<C, T8> $$15, final aao<? super B, T9> $$16, final Function<C, T9> $$17, final aao<? super B, T10> $$18, final Function<C, T10> $$19, final Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, C> $$20) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$110 = $$0.decode($$02);
                Object $$22 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                Object $$52 = $$8.decode($$02);
                Object $$62 = $$10.decode($$02);
                Object $$72 = $$12.decode($$02);
                Object $$82 = $$14.decode($$02);
                Object $$92 = $$16.decode($$02);
                Object $$102 = $$18.decode($$02);
                return $$20.apply($$110, $$22, $$32, $$42, $$52, $$62, $$72, $$82, $$92, $$102);
            }

            @Override
            public void encode(B $$02, C $$110) {
                $$0.encode($$02, $$1.apply($$110));
                $$2.encode($$02, $$3.apply($$110));
                $$4.encode($$02, $$5.apply($$110));
                $$6.encode($$02, $$7.apply($$110));
                $$8.encode($$02, $$9.apply($$110));
                $$10.encode($$02, $$11.apply($$110));
                $$12.encode($$02, $$13.apply($$110));
                $$14.encode($$02, $$15.apply($$110));
                $$16.encode($$02, $$17.apply($$110));
                $$18.encode($$02, $$19.apply($$110));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final aao<? super B, T5> $$8, final Function<C, T5> $$9, final aao<? super B, T6> $$10, final Function<C, T6> $$11, final aao<? super B, T7> $$12, final Function<C, T7> $$13, final aao<? super B, T8> $$14, final Function<C, T8> $$15, final aao<? super B, T9> $$16, final Function<C, T9> $$17, final aao<? super B, T10> $$18, final Function<C, T10> $$19, final aao<? super B, T11> $$20, final Function<C, T11> $$21, final Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, C> $$22) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$110 = $$0.decode($$02);
                Object $$23 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                Object $$52 = $$8.decode($$02);
                Object $$62 = $$10.decode($$02);
                Object $$72 = $$12.decode($$02);
                Object $$82 = $$14.decode($$02);
                Object $$92 = $$16.decode($$02);
                Object $$102 = $$18.decode($$02);
                Object $$112 = $$20.decode($$02);
                return $$22.apply($$110, $$23, $$32, $$42, $$52, $$62, $$72, $$82, $$92, $$102, $$112);
            }

            @Override
            public void encode(B $$02, C $$110) {
                $$0.encode($$02, $$1.apply($$110));
                $$2.encode($$02, $$3.apply($$110));
                $$4.encode($$02, $$5.apply($$110));
                $$6.encode($$02, $$7.apply($$110));
                $$8.encode($$02, $$9.apply($$110));
                $$10.encode($$02, $$11.apply($$110));
                $$12.encode($$02, $$13.apply($$110));
                $$14.encode($$02, $$15.apply($$110));
                $$16.encode($$02, $$17.apply($$110));
                $$18.encode($$02, $$19.apply($$110));
                $$20.encode($$02, $$21.apply($$110));
            }
        };
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> aao<B, C> a(final aao<? super B, T1> $$0, final Function<C, T1> $$1, final aao<? super B, T2> $$2, final Function<C, T2> $$3, final aao<? super B, T3> $$4, final Function<C, T3> $$5, final aao<? super B, T4> $$6, final Function<C, T4> $$7, final aao<? super B, T5> $$8, final Function<C, T5> $$9, final aao<? super B, T6> $$10, final Function<C, T6> $$11, final aao<? super B, T7> $$12, final Function<C, T7> $$13, final aao<? super B, T8> $$14, final Function<C, T8> $$15, final aao<? super B, T9> $$16, final Function<C, T9> $$17, final aao<? super B, T10> $$18, final Function<C, T10> $$19, final aao<? super B, T11> $$20, final Function<C, T11> $$21, final aao<? super B, T12> $$22, final Function<C, T12> $$23, final Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, C> $$24) {
        return new aao<B, C>(){

            @Override
            public C decode(B $$02) {
                Object $$110 = $$0.decode($$02);
                Object $$25 = $$2.decode($$02);
                Object $$32 = $$4.decode($$02);
                Object $$42 = $$6.decode($$02);
                Object $$52 = $$8.decode($$02);
                Object $$62 = $$10.decode($$02);
                Object $$72 = $$12.decode($$02);
                Object $$82 = $$14.decode($$02);
                Object $$92 = $$16.decode($$02);
                Object $$102 = $$18.decode($$02);
                Object $$112 = $$20.decode($$02);
                Object $$122 = $$22.decode($$02);
                return $$24.apply($$110, $$25, $$32, $$42, $$52, $$62, $$72, $$82, $$92, $$102, $$112, $$122);
            }

            @Override
            public void encode(B $$02, C $$110) {
                $$0.encode($$02, $$1.apply($$110));
                $$2.encode($$02, $$3.apply($$110));
                $$4.encode($$02, $$5.apply($$110));
                $$6.encode($$02, $$7.apply($$110));
                $$8.encode($$02, $$9.apply($$110));
                $$10.encode($$02, $$11.apply($$110));
                $$12.encode($$02, $$13.apply($$110));
                $$14.encode($$02, $$15.apply($$110));
                $$16.encode($$02, $$17.apply($$110));
                $$18.encode($$02, $$19.apply($$110));
                $$20.encode($$02, $$21.apply($$110));
                $$22.encode($$02, $$23.apply($$110));
            }
        };
    }

    public static <B, T> aao<B, T> a(final UnaryOperator<aao<B, T>> $$0) {
        return new aao<B, T>(){
            private final Supplier<aao<B, T>> b = Suppliers.memoize(() -> (aao)$$0.apply(this));

            @Override
            public T decode(B $$02) {
                return this.b.get().decode($$02);
            }

            @Override
            public void encode(B $$02, T $$1) {
                this.b.get().encode($$02, $$1);
            }
        };
    }

    default public <S extends B> aao<S, V> a() {
        return this;
    }

    @FunctionalInterface
    public static interface a<B, S, T> {
        public aao<B, T> apply(aao<B, S> var1);
    }
}

