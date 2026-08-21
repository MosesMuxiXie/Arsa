/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL33C
 */
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.OptionalDouble;
import org.lwjgl.opengl.GL33C;

public class fxj
extends fzf {
    private final int a;
    private final AddressMode b;
    private final AddressMode c;
    private final FilterMode d;
    private final FilterMode e;
    private final int f;
    private final OptionalDouble g;
    private boolean h;

    public fxj(AddressMode $$0, AddressMode $$1, FilterMode $$2, FilterMode $$3, int $$4, OptionalDouble $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.a = GL33C.glGenSamplers();
        GL33C.glSamplerParameteri((int)this.a, (int)10242, (int)GlConst.toGl($$0));
        GL33C.glSamplerParameteri((int)this.a, (int)10243, (int)GlConst.toGl($$1));
        if ($$4 > 1) {
            GL33C.glSamplerParameterf((int)this.a, (int)34046, (float)$$4);
        }
        switch ($$2) {
            case NEAREST: {
                GL33C.glSamplerParameteri((int)this.a, (int)10241, (int)9986);
                break;
            }
            case LINEAR: {
                GL33C.glSamplerParameteri((int)this.a, (int)10241, (int)9987);
            }
        }
        switch ($$3) {
            case NEAREST: {
                GL33C.glSamplerParameteri((int)this.a, (int)10240, (int)9728);
                break;
            }
            case LINEAR: {
                GL33C.glSamplerParameteri((int)this.a, (int)10240, (int)9729);
            }
        }
        if ($$5.isPresent()) {
            GL33C.glSamplerParameterf((int)this.a, (int)33083, (float)((float)$$5.getAsDouble()));
        }
    }

    public int a() {
        return this.a;
    }

    @Override
    public AddressMode b() {
        return this.b;
    }

    @Override
    public AddressMode c() {
        return this.c;
    }

    @Override
    public FilterMode d() {
        return this.d;
    }

    @Override
    public FilterMode e() {
        return this.e;
    }

    @Override
    public int f() {
        return this.f;
    }

    @Override
    public OptionalDouble g() {
        return this.g;
    }

    @Override
    public void close() {
        if (!this.h) {
            this.h = true;
            GL33C.glDeleteSamplers((int)this.a);
        }
    }

    public boolean h() {
        return this.h;
    }
}

