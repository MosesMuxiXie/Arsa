/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
import org.joml.Matrix4f;

public final class fwd
extends Enum<fwd> {
    public static final /* enum */ fwd a = new fwd(fzr.a, ($$0, $$1) -> $$0.scale(1.0f - $$1 / 4096.0f));
    public static final /* enum */ fwd b = new fwd(fzr.b, ($$0, $$1) -> $$0.translate(0.0f, 0.0f, $$1 / 512.0f));
    private final fzr c;
    private final a d;
    private static final /* synthetic */ fwd[] e;

    public static fwd[] values() {
        return (fwd[])e.clone();
    }

    public static fwd valueOf(String $$0) {
        return Enum.valueOf(fwd.class, $$0);
    }

    private fwd(fzr $$0, a $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public fzr a() {
        return this.c;
    }

    public void a(Matrix4f $$0, float $$1) {
        this.d.apply($$0, $$1);
    }

    private static /* synthetic */ fwd[] b() {
        return new fwd[]{a, b};
    }

    static {
        e = fwd.b();
    }

    @FunctionalInterface
    static interface a {
        public void apply(Matrix4f var1, float var2);
    }
}

