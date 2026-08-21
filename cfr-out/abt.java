/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class abt
implements aay<abg> {
    public static final aao<wx, abt> a = aay.a(abt::a, abt::new);
    private final Map<amt<? extends jq<?>>, beh.a> b;

    public abt(Map<amt<? extends jq<?>>, beh.a> $$0) {
        this.b = $$0;
    }

    private abt(wx $$0) {
        this.b = $$0.a(wx::r, beh.a::b);
    }

    @Override
    private void a(wx $$02) {
        $$02.a(this.b, wx::b, ($$0, $$1) -> $$1.a((wx)((Object)$$0)));
    }

    @Override
    public aba<abt> a() {
        return abu.m;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    public Map<amt<? extends jq<?>>, beh.a> b() {
        return this.b;
    }
}

