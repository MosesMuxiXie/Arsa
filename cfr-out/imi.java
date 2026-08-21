/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class imi
extends bbe<int[]> {
    private static final amo a = amo.b("textures/colormap/dry_foliage.png");

    protected int[] a(baz $$0, bzm $$1) {
        try {
            return imm.a($$0, a);
        }
        catch (IOException $$2) {
            throw new IllegalStateException("Failed to load dry foliage color texture", $$2);
        }
    }

    @Override
    protected void a(int[] $$0, baz $$1, bzm $$2) {
        dwd.a($$0);
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }
}

