/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class isc
extends gsb {
    protected static final int d = 17;
    protected static final int e = 7;
    protected static final long f = 0x140000000L;
    protected static final int t = -11776948;
    protected static final int u = -9671572;
    protected static final int v = -8388737;
    protected static final int w = -13408581;
    protected static final int x = -9670204;
    protected static final int y = 32;
    protected static final int z = 8;
    protected static final amo A = amo.b("textures/gui/title/realms.png");
    protected static final int B = 128;
    protected static final int C = 34;
    protected static final int D = 128;
    protected static final int E = 64;
    private final List<isb> a = Lists.newArrayList();

    public isc(yh $$0) {
        super($$0);
    }

    protected static int a(int $$0) {
        return 40 + $$0 * 13;
    }

    protected isb a(isb $$0) {
        this.a.add($$0);
        return this.a($$0);
    }

    public yh p() {
        return yg.a(this.a.stream().map(isb::a).collect(Collectors.toList()));
    }

    protected static gjr F() {
        return gjr.a(128, 34, A, 128, 64);
    }
}

