/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.OptionalDouble;

public class fzb {
    private final fzf[] a = new fzf[32];

    public void a() {
        GpuDevice $$0 = RenderSystem.getDevice();
        if (AddressMode.values().length != 2 || FilterMode.values().length != 2) {
            throw new IllegalStateException("AddressMode and FilterMode enum sizes must be 2 - if you expanded them, please update SamplerCache");
        }
        for (AddressMode $$1 : AddressMode.values()) {
            for (AddressMode $$2 : AddressMode.values()) {
                for (FilterMode $$3 : FilterMode.values()) {
                    for (FilterMode $$4 : FilterMode.values()) {
                        for (boolean $$5 : new boolean[]{true, false}) {
                            this.a[fzb.b((AddressMode)$$1, (AddressMode)$$2, (FilterMode)$$3, (FilterMode)$$4, (boolean)$$5)] = $$0.createSampler($$1, $$2, $$3, $$4, 1, $$5 ? OptionalDouble.empty() : OptionalDouble.of(0.0));
                        }
                    }
                }
            }
        }
    }

    public fzf a(AddressMode $$0, AddressMode $$1, FilterMode $$2, FilterMode $$3, boolean $$4) {
        return this.a[fzb.b($$0, $$1, $$2, $$3, $$4)];
    }

    public fzf a(FilterMode $$0) {
        return this.a(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, $$0, $$0, false);
    }

    public fzf a(FilterMode $$0, boolean $$1) {
        return this.a(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, $$0, $$0, $$1);
    }

    public fzf b(FilterMode $$0) {
        return this.a(AddressMode.REPEAT, AddressMode.REPEAT, $$0, $$0, false);
    }

    public fzf b(FilterMode $$0, boolean $$1) {
        return this.a(AddressMode.REPEAT, AddressMode.REPEAT, $$0, $$0, $$1);
    }

    public void b() {
        for (fzf $$0 : this.a) {
            $$0.close();
        }
    }

    @VisibleForTesting
    static int b(AddressMode $$0, AddressMode $$1, FilterMode $$2, FilterMode $$3, boolean $$4) {
        int $$5 = 0;
        $$5 |= $$0.ordinal() & 1;
        $$5 |= ($$1.ordinal() & 1) << 1;
        $$5 |= ($$2.ordinal() & 1) << 2;
        $$5 |= ($$3.ordinal() & 1) << 3;
        if ($$4) {
            $$5 |= 0x10;
        }
        return $$5;
    }
}

