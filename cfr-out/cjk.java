/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cjk
extends cjd<chl> {
    private final cqw<Integer> c;

    public cjk(cqw<Integer> $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of($$0, (Object)((Object)cqx.a)));
        this.c = $$0;
    }

    private Optional<Integer> b(chl $$0) {
        return $$0.ev().c(this.c);
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected boolean a(axf $$0, chl $$1, long $$2) {
        Optional<Integer> $$3 = this.b($$1);
        return $$3.isPresent() && $$3.get() > 0;
    }

    @Override
    protected void c(axf $$0, chl $$1, long $$2) {
        Optional<Integer> $$3 = this.b($$1);
        $$1.ev().a(this.c, $$3.get() - 1);
    }

    @Override
    protected void b(axf $$0, chl $$1, long $$2) {
        $$1.ev().b(this.c);
    }
}

