/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2i
 *  org.joml.Vector2ic
 */
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class gvl
implements gvj {
    private static final int c = 5;
    private static final int d = 12;
    public static final int a = 3;
    public static final int b = 5;
    private final gpm e;

    public gvl(gpm $$0) {
        this.e = $$0;
    }

    @Override
    public Vector2ic a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        int $$9;
        Vector2i $$6 = new Vector2i($$2 + 12, $$3);
        if ($$6.x + $$4 > $$0 - 5) {
            $$6.x = Math.max($$2 - 12 - $$4, 9);
        }
        $$6.y += 3;
        int $$7 = $$5 + 3 + 3;
        int $$8 = this.e.c() + 3 + gvl.a(0, 0, this.e.h());
        $$6.y = $$8 + $$7 <= ($$9 = $$1 - 5) ? ($$6.y += gvl.a($$6.y, this.e.b(), this.e.h())) : ($$6.y -= $$7 + gvl.a($$6.y, this.e.c(), this.e.h()));
        return $$6;
    }

    private static int a(int $$0, int $$1, int $$2) {
        int $$3 = Math.min(Math.abs($$0 - $$1), $$2);
        return Math.round(bgj.h((float)$$3 / (float)$$2, $$2 - 3, 5.0f));
    }
}

