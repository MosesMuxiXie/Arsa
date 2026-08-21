/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  io.netty.buffer.ByteBuf
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import org.slf4j.Logger;

public final class dpf<IdType>
implements dpe {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "id";
    final IdType c;
    final uz d;

    public static <T> Codec<dpf<T>> a(final Codec<T> $$0) {
        return new Codec<dpf<T>>(){

            public <V> DataResult<Pair<dpf<T>, V>> decode(DynamicOps<V> $$02, V $$1) {
                return doe.b.decode($$02, $$1).flatMap($$3 -> {
                    uz $$4 = ((uz)$$3.getFirst()).l();
                    vz $$5 = $$4.r(dpf.b);
                    if ($$5 == null) {
                        return DataResult.error(() -> "Expected 'id' field in " + String.valueOf($$1));
                    }
                    return $$0.parse(1.a($$02), (Object)$$5).map($$2 -> Pair.of(new dpf<Object>($$2, $$4), (Object)$$3.getSecond()));
                });
            }

            public <V> DataResult<V> a(dpf<T> $$02, DynamicOps<V> $$1, V $$2) {
                return $$0.encodeStart(1.a($$1), $$02.c).flatMap($$3 -> {
                    uz $$4 = $$02.d.l();
                    $$4.a(dpf.b, (vz)$$3);
                    return doe.b.encode((Object)$$4, $$1, $$2);
                });
            }

            private static <T> DynamicOps<vz> a(DynamicOps<T> $$02) {
                if ($$02 instanceof ams) {
                    ams $$1 = (ams)$$02;
                    return $$1.a(vn.a);
                }
                return vn.a;
            }

            public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
                return this.a((dpf)object, dynamicOps, object2);
            }
        };
    }

    public static <B extends ByteBuf, T> aao<B, dpf<T>> a(aao<B, T> $$0) {
        return aao.a($$0, dpf::a, aam.s, dpf::d, dpf::new);
    }

    dpf(IdType $$0, uz $$1) {
        this.c = $$0;
        this.d = dpf.a($$1);
    }

    public static <T> dpf<T> a(T $$0, uz $$1) {
        return new dpf<T>($$0, $$1);
    }

    private static uz a(uz $$0) {
        if ($$0.b(b)) {
            uz $$1 = $$0.l();
            $$1.r(b);
            return $$1;
        }
        return $$0;
    }

    public IdType a() {
        return this.c;
    }

    public boolean a(String $$0) {
        return this.d.b($$0);
    }

    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if ($$0 instanceof dpf) {
            dpf $$1 = (dpf)$$0;
            return this.c == $$1.c && this.d.equals($$1.d);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.c.hashCode() + this.d.hashCode();
    }

    public String toString() {
        return String.valueOf(this.c) + " " + String.valueOf(this.d);
    }

    public void a(cgk $$0) {
        try (bgp.j $$1 = new bgp.j($$0.es(), a);){
            fnp $$2 = fnp.a($$1, $$0.eo());
            $$0.d($$2);
            uz $$3 = $$2.b();
            UUID $$4 = $$0.cY();
            $$3.a(this.b());
            $$0.d(fno.a((bgp)$$1, (jf.a)$$0.eo(), $$3));
            $$0.a($$4);
        }
    }

    /*
     * Exception decompiling
     */
    public boolean a(elb $$0, jf.a $$1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CATCHBLOCK]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private uz d() {
        return this.d;
    }

    @Deprecated
    public uz b() {
        return this.d;
    }

    public uz c() {
        return this.d.l();
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        if (this.c.getClass() == cgu.class) {
            cgu $$4 = (cgu)this.c;
            if ($$0.c() && !$$4.s()) {
                $$1.accept(yh.c("item.spawn_egg.peaceful").a(l.m));
            }
        }
    }

    private static /* synthetic */ String e() {
        return "(rollback)";
    }
}

