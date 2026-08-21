/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2i
 *  org.joml.Vector2ic
 */
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class gve
implements gvj {
    private final gpm a;

    public gve(gpm $$0) {
        this.a = $$0;
    }

    @Override
    public Vector2ic a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        Vector2i $$6 = new Vector2i();
        $$6.x = this.a.d() + 3;
        $$6.y = this.a.c() + 3 + 1;
        if ($$6.y + $$5 + 3 > $$1) {
            $$6.y = this.a.b() - $$5 - 3 - 1;
        }
        if ($$6.x + $$4 > $$0) {
            $$6.x = Math.max(this.a.e() - $$4 - 3, 4);
        }
        return $$6;
    }
}

