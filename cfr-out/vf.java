/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class vf
extends AbstractList<vz>
implements uy {
    private static final String b = "";
    private static final int c = 36;
    public static final wb<vf> a = new wb.b<vf>(){

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public vf a(DataInput $$0, vi $$1) throws IOException {
            $$1.d();
            try {
                vf vf2 = 1.d($$0, $$1);
                return vf2;
            }
            finally {
                $$1.e();
            }
        }

        private static vf d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(36L);
            byte $$2 = $$0.readByte();
            int $$3 = 1.a($$0);
            if ($$2 == 0 && $$3 > 0) {
                throw new vl("Missing type on ListTag");
            }
            $$1.a(4L, $$3);
            wb<?> $$4 = wc.a($$2);
            vf $$5 = new vf(new ArrayList<vz>($$3));
            for (int $$6 = 0; $$6 < $$3; ++$$6) {
                $$5.a((vz)$$4.c($$0, $$1));
            }
            return $$5;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            $$2.d();
            try {
                vw.b b2 = 1.c($$0, $$1, $$2);
                return b2;
            }
            finally {
                $$2.e();
            }
        }

        /*
         * Exception decompiling
         */
        private static vw.b c(DataInput $$0, vw $$1, vi $$2) throws IOException {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[SWITCH], 8[CASE]], but top level block is 9[SWITCH]
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        private static int a(DataInput $$0) throws IOException {
            int $$1 = $$0.readInt();
            if ($$1 < 0) {
                throw new vl("ListTag length cannot be negative: " + $$1);
            }
            return $$1;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void b(DataInput $$0, vi $$1) throws IOException {
            $$1.d();
            try {
                wb<?> $$2 = wc.a($$0.readByte());
                int $$3 = $$0.readInt();
                $$2.a($$0, $$3, $$1);
            }
            finally {
                $$1.e();
            }
        }

        @Override
        public String a() {
            return "LIST";
        }

        @Override
        public String b() {
            return "TAG_List";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };
    private final List<vz> v;

    public vf() {
        this(new ArrayList<vz>());
    }

    vf(List<vz> $$0) {
        this.v = $$0;
    }

    private static vz a(uz $$0) {
        vz $$1;
        if ($$0.i() == 1 && ($$1 = $$0.a(b)) != null) {
            return $$1;
        }
        return $$0;
    }

    private static boolean b(uz $$0) {
        return $$0.i() == 1 && $$0.b(b);
    }

    private static vz a(byte $$0, vz $$1) {
        uz $$2;
        if ($$0 != 10) {
            return $$1;
        }
        if ($$1 instanceof uz && !vf.b($$2 = (uz)$$1)) {
            return $$2;
        }
        return vf.b($$1);
    }

    private static uz b(vz $$0) {
        return new uz(Map.of(b, $$0));
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        byte $$1 = this.e();
        $$0.writeByte($$1);
        $$0.writeInt(this.v.size());
        for (vz $$2 : this.v) {
            vf.a($$1, $$2).a($$0);
        }
    }

    @VisibleForTesting
    byte e() {
        byte $$0 = 0;
        for (vz $$1 : this.v) {
            byte $$2 = $$1.b();
            if ($$0 == 0) {
                $$0 = $$2;
                continue;
            }
            if ($$0 == $$2) continue;
            return 10;
        }
        return $$0;
    }

    public void a(vz $$0) {
        if ($$0 instanceof uz) {
            uz $$1 = (uz)$$0;
            this.add(vf.a($$1));
        } else {
            this.add($$0);
        }
    }

    @Override
    public int a() {
        int $$0 = 36;
        $$0 += 4 * this.v.size();
        for (vz $$1 : this.v) {
            $$0 += $$1.a();
        }
        return $$0;
    }

    @Override
    public byte b() {
        return 9;
    }

    public wb<vf> c() {
        return a;
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    @Override
    public vz d(int $$0) {
        return this.v.remove($$0);
    }

    @Override
    public boolean isEmpty() {
        return this.v.isEmpty();
    }

    public Optional<uz> a(int $$0) {
        vz vz2 = this.n($$0);
        if (vz2 instanceof uz) {
            uz $$1 = (uz)vz2;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public uz b(int $$0) {
        return this.a($$0).orElseGet(uz::new);
    }

    public Optional<vf> e(int $$0) {
        vz vz2 = this.n($$0);
        if (vz2 instanceof vf) {
            vf $$1 = (vf)vz2;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public vf f(int $$0) {
        return this.e($$0).orElseGet(vf::new);
    }

    public Optional<Short> g(int $$0) {
        return this.o($$0).flatMap(vz::q);
    }

    public short a(int $$0, short $$1) {
        vz vz2 = this.n($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.i();
        }
        return $$1;
    }

    public Optional<Integer> h(int $$0) {
        return this.o($$0).flatMap(vz::r);
    }

    public int a(int $$0, int $$1) {
        vz vz2 = this.n($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.h();
        }
        return $$1;
    }

    public Optional<int[]> i(int $$0) {
        vz vz2 = this.n($$0);
        if (vz2 instanceof vd) {
            vd $$1 = (vd)vz2;
            return Optional.of($$1.g());
        }
        return Optional.empty();
    }

    public Optional<long[]> j(int $$0) {
        vz vz2 = this.n($$0);
        if (vz2 instanceof vg) {
            vg $$1 = (vg)vz2;
            return Optional.of($$1.g());
        }
        return Optional.empty();
    }

    public Optional<Double> k(int $$0) {
        return this.o($$0).flatMap(vz::u);
    }

    public double a(int $$0, double $$1) {
        vz vz2 = this.n($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.k();
        }
        return $$1;
    }

    public Optional<Float> l(int $$0) {
        return this.o($$0).flatMap(vz::t);
    }

    public float a(int $$0, float $$1) {
        vz vz2 = this.n($$0);
        if (vz2 instanceof vp) {
            vp $$2 = (vp)vz2;
            return $$2.l();
        }
        return $$1;
    }

    public Optional<String> m(int $$0) {
        return this.o($$0).flatMap(vz::p_);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a(int $$0, String $$1) {
        vz $$2 = this.n($$0);
        if (!($$2 instanceof vx)) return $$1;
        vx vx2 = (vx)$$2;
        try {
            String string = vx2.k();
            return string;
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    private @Nullable vz n(int $$0) {
        return $$0 >= 0 && $$0 < this.v.size() ? this.v.get($$0) : null;
    }

    private Optional<vz> o(int $$0) {
        return Optional.ofNullable(this.n($$0));
    }

    @Override
    public int size() {
        return this.v.size();
    }

    @Override
    public vz c(int $$0) {
        return this.v.get($$0);
    }

    public vz c(int $$0, vz $$1) {
        return this.v.set($$0, $$1);
    }

    public void d(int $$0, vz $$1) {
        this.v.add($$0, $$1);
    }

    @Override
    public boolean a(int $$0, vz $$1) {
        this.v.set($$0, $$1);
        return true;
    }

    @Override
    public boolean b(int $$0, vz $$1) {
        this.v.add($$0, $$1);
        return true;
    }

    public vf g() {
        ArrayList<vz> $$0 = new ArrayList<vz>(this.v.size());
        for (vz $$1 : this.v) {
            $$0.add($$1.d());
        }
        return new vf($$0);
    }

    @Override
    public Optional<vf> t_() {
        return Optional.of(this);
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof vf && Objects.equals(this.v, ((vf)$$0).v);
    }

    @Override
    public int hashCode() {
        return this.v.hashCode();
    }

    @Override
    public Stream<vz> stream() {
        return super.stream();
    }

    public Stream<uz> j() {
        return this.stream().mapMulti(($$0, $$1) -> {
            if ($$0 instanceof uz) {
                uz $$2 = (uz)$$0;
                $$1.accept($$2);
            }
        });
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    @Override
    public void clear() {
        this.v.clear();
    }

    @Override
    public vw.b a(vw $$0) {
        byte $$1 = this.e();
        switch ($$0.a(wc.a($$1), this.v.size())) {
            case c: {
                return vw.b.c;
            }
            case b: {
                return $$0.b();
            }
        }
        block13: for (int $$2 = 0; $$2 < this.v.size(); ++$$2) {
            vz $$3 = vf.a($$1, this.v.get($$2));
            switch ($$0.b($$3.c(), $$2)) {
                case d: {
                    return vw.b.c;
                }
                case b: {
                    continue block13;
                }
                case c: {
                    return $$0.b();
                }
                default: {
                    switch ($$3.a($$0)) {
                        case c: {
                            return vw.b.c;
                        }
                        case b: {
                            return $$0.b();
                        }
                    }
                }
            }
        }
        return $$0.b();
    }

    @Override
    public /* synthetic */ Object remove(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ void add(int n2, Object object) {
        this.d(n2, (vz)object);
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.c(n2, (vz)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ vz d() {
        return this.g();
    }
}

