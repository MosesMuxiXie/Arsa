/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2i
 *  org.joml.Vector2ic
 */
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class gvk
implements gvj {
    public static final gvj a = new gvk();

    private gvk() {
    }

    @Override
    public Vector2ic a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        Vector2i $$6 = new Vector2i($$2, $$3).add(12, -12);
        this.a($$0, $$1, $$6, $$4, $$5);
        return $$6;
    }

    private void a(int $$0, int $$1, Vector2i $$2, int $$3, int $$4) {
        int $$5;
        if ($$2.x + $$3 > $$0) {
            $$2.x = Math.max($$2.x - 24 - $$3, 4);
        }
        if ($$2.y + ($$5 = $$4 + 3) > $$1) {
            $$2.y = $$1 - $$5;
        }
    }
}

