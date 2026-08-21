/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.UnaryOperator;

public class hdo {
    private final hdq a;

    public hdo() {
        this(new hdq((List<hdj>)ImmutableList.of(), hdi.a));
    }

    private hdo(hdq $$0) {
        this.a = $$0;
    }

    public hdq a() {
        return this.a;
    }

    public hdo a(UnaryOperator<hdi> $$0) {
        return new hdo(this.a.a($$0));
    }

    public hdo a(hdp $$0) {
        return $$0.apply(this);
    }
}

