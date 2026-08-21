/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class emt {
    private static final Codec<yh[]> c = yj.a.listOf().comapFlatMap($$0 -> {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.NewAnonymousArray.getDimSize(NewAnonymousArray.java:142)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.isNewArrayLambda(LambdaRewriter.java:455)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:409)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:167)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:105)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.applyExpressionRewriterToArgs(AbstractMemberFunctionInvokation.java:101)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.applyExpressionRewriter(AbstractMemberFunctionInvokation.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:103)
         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredReturn.rewriteExpressions(StructuredReturn.java:99)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }, $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3]));
    public static final Codec<emt> a = RecordCodecBuilder.create($$02 -> $$02.group((App)c.fieldOf("messages").forGetter($$0 -> $$0.d), (App)c.lenientOptionalFieldOf("filtered_messages").forGetter(emt::d), (App)dkr.q.fieldOf("color").orElse((Object)dkr.p).forGetter($$0 -> $$0.f), (App)Codec.BOOL.fieldOf("has_glowing_text").orElse((Object)false).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, emt::a));
    public static final int b = 4;
    private final yh[] d;
    private final yh[] e;
    private final dkr f;
    private final boolean g;
    private bfr @Nullable [] h;
    private boolean i;

    public emt() {
        this(emt.c(), emt.c(), dkr.p, false);
    }

    public emt(yh[] $$0, yh[] $$1, dkr $$2, boolean $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    private static yh[] c() {
        return new yh[]{yg.a, yg.a, yg.a, yg.a};
    }

    private static emt a(yh[] $$0, Optional<yh[]> $$1, dkr $$2, boolean $$3) {
        return new emt($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
    }

    public boolean a() {
        return this.g;
    }

    public emt a(boolean $$0) {
        if ($$0 == this.g) {
            return this;
        }
        return new emt(this.d, this.e, this.f, $$0);
    }

    public dkr b() {
        return this.f;
    }

    public emt a(dkr $$0) {
        if ($$0 == this.b()) {
            return this;
        }
        return new emt(this.d, this.e, $$0, this.g);
    }

    public yh a(int $$0, boolean $$1) {
        return this.b($$1)[$$0];
    }

    public emt a(int $$0, yh $$1) {
        return this.a($$0, $$1, $$1);
    }

    public emt a(int $$0, yh $$1, yh $$2) {
        yh[] $$3 = Arrays.copyOf(this.d, this.d.length);
        yh[] $$4 = Arrays.copyOf(this.e, this.e.length);
        $$3[$$0] = $$1;
        $$4[$$0] = $$2;
        return new emt($$3, $$4, this.f, this.g);
    }

    public boolean a(ddm $$02) {
        return Arrays.stream(this.b($$02.Z())).anyMatch($$0 -> !$$0.getString().isEmpty());
    }

    public yh[] b(boolean $$0) {
        return $$0 ? this.e : this.d;
    }

    public bfr[] a(boolean $$0, Function<yh, bfr> $$1) {
        if (this.h == null || this.i != $$0) {
            this.i = $$0;
            this.h = new bfr[4];
            for (int $$2 = 0; $$2 < 4; ++$$2) {
                this.h[$$2] = $$1.apply(this.a($$2, $$0));
            }
        }
        return this.h;
    }

    private Optional<yh[]> d() {
        for (int $$0 = 0; $$0 < 4; ++$$0) {
            if (this.e[$$0].equals(this.d[$$0])) continue;
            return Optional.of(this.e);
        }
        return Optional.empty();
    }

    public boolean b(ddm $$0) {
        for (yh $$1 : this.b($$0.Z())) {
            zf $$2 = $$1.a();
            yf $$3 = $$2.i();
            if ($$3 == null || $$3.a() != yf.a.c) continue;
            return true;
        }
        return false;
    }
}

