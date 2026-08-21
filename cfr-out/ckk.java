/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ckk
extends cjd<chn> {
    public ckk(int $$0, int $$1) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.o, (Object)((Object)cqx.a)), $$0, $$1);
    }

    @Override
    protected boolean a(axf $$0, chn $$12, long $$2) {
        return $$12.ev().c(cqw.o).filter($$1 -> $$1.a($$12)).isPresent();
    }

    @Override
    protected void b(axf $$0, chn $$1, long $$2) {
        $$1.ev().b(cqw.o);
    }

    @Override
    protected void c(axf $$0, chn $$12, long $$2) {
        $$12.ev().c(cqw.o).ifPresent($$1 -> $$12.J().a($$1.a()));
    }
}

