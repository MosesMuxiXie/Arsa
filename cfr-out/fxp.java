/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.ARBVertexAttribBinding
 *  org.lwjgl.opengl.GLCapabilities
 */
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBVertexAttribBinding;
import org.lwjgl.opengl.GLCapabilities;

public abstract class fxp {
    public static fxp a(GLCapabilities $$0, fxd $$1, Set<String> $$2) {
        if ($$0.GL_ARB_vertex_attrib_binding && fxe.a) {
            $$2.add("GL_ARB_vertex_attrib_binding");
            return new b($$1);
        }
        return new a($$1);
    }

    public abstract void a(VertexFormat var1, @Nullable fxa var2);

    static class b
    extends fxp {
        private final Map<VertexFormat, c> a = new HashMap<VertexFormat, c>();
        private final fxd b;
        private final boolean c;

        public b(fxd $$0) {
            String $$1;
            this.b = $$0;
            this.c = "Mesa".equals(GlStateManager._getString(7936)) ? ($$1 = GlStateManager._getString(7938)).contains("25.0.0") || $$1.contains("25.0.1") || $$1.contains("25.0.2") : false;
        }

        @Override
        public void a(VertexFormat $$0, @Nullable fxa $$1) {
            c $$2 = this.a.get($$0);
            if ($$2 == null) {
                int $$3 = GlStateManager._glGenVertexArrays();
                GlStateManager._glBindVertexArray($$3);
                if ($$1 != null) {
                    List<VertexFormatElement> $$4 = $$0.getElements();
                    for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
                        VertexFormatElement $$6 = $$4.get($$5);
                        GlStateManager._enableVertexAttribArray($$5);
                        switch ($$6.usage()) {
                            case POSITION: 
                            case GENERIC: 
                            case UV: {
                                if ($$6.type() == VertexFormatElement.Type.FLOAT) {
                                    ARBVertexAttribBinding.glVertexAttribFormat((int)$$5, (int)$$6.count(), (int)GlConst.toGl($$6.type()), (boolean)false, (int)$$0.getOffset($$6));
                                    break;
                                }
                                ARBVertexAttribBinding.glVertexAttribIFormat((int)$$5, (int)$$6.count(), (int)GlConst.toGl($$6.type()), (int)$$0.getOffset($$6));
                                break;
                            }
                            case NORMAL: 
                            case COLOR: {
                                ARBVertexAttribBinding.glVertexAttribFormat((int)$$5, (int)$$6.count(), (int)GlConst.toGl($$6.type()), (boolean)true, (int)$$0.getOffset($$6));
                            }
                        }
                        ARBVertexAttribBinding.glVertexAttribBinding((int)$$5, (int)0);
                    }
                }
                if ($$1 != null) {
                    ARBVertexAttribBinding.glBindVertexBuffer((int)0, (int)$$1.d, (long)0L, (int)$$0.getVertexSize());
                }
                c $$7 = new c($$3, $$0, $$1);
                this.b.a($$7);
                this.a.put($$0, $$7);
                return;
            }
            GlStateManager._glBindVertexArray($$2.a);
            if ($$1 != null && $$2.c != $$1) {
                if (this.c && $$2.c != null && $$2.c.d == $$1.d) {
                    ARBVertexAttribBinding.glBindVertexBuffer((int)0, (int)0, (long)0L, (int)0);
                }
                ARBVertexAttribBinding.glBindVertexBuffer((int)0, (int)$$1.d, (long)0L, (int)$$0.getVertexSize());
                $$2.c = $$1;
            }
        }
    }

    static class a
    extends fxp {
        private final Map<VertexFormat, c> a = new HashMap<VertexFormat, c>();
        private final fxd b;

        public a(fxd $$0) {
            this.b = $$0;
        }

        @Override
        public void a(VertexFormat $$0, @Nullable fxa $$1) {
            c $$2 = this.a.get($$0);
            if ($$2 == null) {
                int $$3 = GlStateManager._glGenVertexArrays();
                GlStateManager._glBindVertexArray($$3);
                if ($$1 != null) {
                    GlStateManager._glBindBuffer(34962, $$1.d);
                    fxp$a.a($$0, true);
                }
                c $$4 = new c($$3, $$0, $$1);
                this.b.a($$4);
                this.a.put($$0, $$4);
                return;
            }
            GlStateManager._glBindVertexArray($$2.a);
            if ($$1 != null && $$2.c != $$1) {
                GlStateManager._glBindBuffer(34962, $$1.d);
                $$2.c = $$1;
                fxp$a.a($$0, false);
            }
        }

        private static void a(VertexFormat $$0, boolean $$1) {
            int $$2 = $$0.getVertexSize();
            List<VertexFormatElement> $$3 = $$0.getElements();
            block4: for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
                VertexFormatElement $$5 = $$3.get($$4);
                if ($$1) {
                    GlStateManager._enableVertexAttribArray($$4);
                }
                switch ($$5.usage()) {
                    case POSITION: 
                    case GENERIC: 
                    case UV: {
                        if ($$5.type() == VertexFormatElement.Type.FLOAT) {
                            GlStateManager._vertexAttribPointer($$4, $$5.count(), GlConst.toGl($$5.type()), false, $$2, $$0.getOffset($$5));
                            continue block4;
                        }
                        GlStateManager._vertexAttribIPointer($$4, $$5.count(), GlConst.toGl($$5.type()), $$2, $$0.getOffset($$5));
                        continue block4;
                    }
                    case NORMAL: 
                    case COLOR: {
                        GlStateManager._vertexAttribPointer($$4, $$5.count(), GlConst.toGl($$5.type()), true, $$2, $$0.getOffset($$5));
                    }
                }
            }
        }
    }

    public static class c {
        final int a;
        final VertexFormat b;
        @Nullable fxa c;

        c(int $$0, VertexFormat $$1, @Nullable fxa $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }
}

