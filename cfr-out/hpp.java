/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class hpp
implements hpo {
    private final Int2ObjectAVLTreeMap<hpn> a = new Int2ObjectAVLTreeMap();

    public hpn b(int $$02) {
        return (hpn)this.a.computeIfAbsent($$02, $$0 -> new hpn(this));
    }

    @Override
    public void a(fzm $$0, float $$1, List<idf.b> $$2) {
        this.b(0).a($$0, $$1, $$2);
    }

    @Override
    public void a(fzm $$0, @Nullable ftm $$1, int $$2, yh $$3, boolean $$4, int $$5, double $$6, ikp $$7) {
        this.b(0).a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public void a(fzm $$0, float $$1, float $$2, bfr $$3, boolean $$4, gio.a $$5, int $$6, int $$7, int $$8, int $$9) {
        this.b(0).a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
    }

    @Override
    public void a(fzm $$0, idf $$1, Quaternionf $$2) {
        this.b(0).a($$0, $$1, $$2);
    }

    @Override
    public void a(fzm $$0, idf.a $$1) {
        this.b(0).a($$0, $$1);
    }

    @Override
    public <S> void a(gzp<? super S> $$0, S $$1, fzm $$2, ijs $$3, int $$4, int $$5, int $$6, @Nullable ilp $$7, int $$8, @Nullable igi.a $$9) {
        this.b(0).a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
    }

    @Override
    public void a(hdg $$0, fzm $$1, ijs $$2, int $$3, int $$4, @Nullable ilp $$5, boolean $$6, boolean $$7, int $$8, @Nullable igi.a $$9, int $$10) {
        this.b(0).a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
    }

    @Override
    public void a(fzm $$0, eoh $$1, int $$2, int $$3, int $$4) {
        this.b(0).a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void a(fzm $$0, hpz $$1) {
        this.b(0).a($$0, $$1);
    }

    @Override
    public void a(fzm $$0, ijs $$1, hqh $$2, float $$3, float $$4, float $$5, int $$6, int $$7, int $$8) {
        this.b(0).a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
    }

    @Override
    public void a(fzm $$0, dlr $$1, int $$2, int $$3, int $$4, int[] $$5, List<hqa> $$6, ijs $$7, ihm.a $$8) {
        this.b(0).a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
    }

    @Override
    public void a(fzm $$0, ijs $$1, hpo.a $$2) {
        this.b(0).a($$0, $$1, $$2);
    }

    @Override
    public void a(hpo.b $$0) {
        this.b(0).a($$0);
    }

    public void a() {
        this.a.values().forEach(hpn::o);
    }

    public void b() {
        this.a.values().removeIf($$0 -> !$$0.n());
        this.a.values().forEach(hpn::p);
    }

    public Int2ObjectAVLTreeMap<hpn> c() {
        return this.a;
    }

    @Override
    public /* synthetic */ hop a(int n2) {
        return this.b(n2);
    }

    public record c(fzm.a a, hpo.a b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "pose;customGeometryRenderer", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "pose;customGeometryRenderer", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "pose;customGeometryRenderer", "a", "b"}, this, $$0);
        }
    }

    public record e(fzm.a a, dlr b, int c, int d, int e, int[] f, List<hqa> g, ijs h, ihm.a i) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "pose;displayContext;lightCoords;overlayCoords;outlineColor;tintLayers;quads;renderType;foilType", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "pose;displayContext;lightCoords;overlayCoords;outlineColor;tintLayers;quads;renderType;foilType", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "pose;displayContext;lightCoords;overlayCoords;outlineColor;tintLayers;quads;renderType;foilType", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }
    }

    public record a(fzm.a a, ijs b, hqh c, float d, float e, float f, int g, int h, int i) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pose;renderType;model;r;g;b;lightCoords;overlayCoords;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pose;renderType;model;r;g;b;lightCoords;overlayCoords;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pose;renderType;model;r;g;b;lightCoords;overlayCoords;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }
    }

    public record i(Matrix4f a, hpz b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "pose;movingBlockRenderState", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "pose;movingBlockRenderState", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "pose;movingBlockRenderState", "a", "b"}, this, $$0);
        }
    }

    public record b(fzm.a a, eoh b, int c, int d, int e) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "pose;state;lightCoords;overlayCoords;outlineColor", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "pose;state;lightCoords;overlayCoords;outlineColor", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "pose;state;lightCoords;overlayCoords;outlineColor", "a", "b", "c", "d", "e"}, this, $$0);
        }
    }

    public record m<S>(h<S> a, ijs b, Vector3f c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{m.class, "modelSubmit;renderType;position", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{m.class, "modelSubmit;renderType;position", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{m.class, "modelSubmit;renderType;position", "a", "b", "c"}, this, $$0);
        }
    }

    public record g(fzm.a a, hdg b, int c, int d, @Nullable ilp e, boolean f, boolean g, int h, @Nullable igi.a i, int j) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "pose;modelPart;lightCoords;overlayCoords;sprite;sheeted;hasFoil;tintedColor;crumblingOverlay;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "pose;modelPart;lightCoords;overlayCoords;sprite;sheeted;hasFoil;tintedColor;crumblingOverlay;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "pose;modelPart;lightCoords;overlayCoords;sprite;sheeted;hasFoil;tintedColor;crumblingOverlay;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
        }
    }

    public record h<S>(fzm.a a, gzp<? super S> b, S c, int d, int e, int f, @Nullable ilp g, int h, @Nullable igi.a i) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "pose;model;state;lightCoords;overlayCoords;tintedColor;sprite;outlineColor;crumblingOverlay", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "pose;model;state;lightCoords;overlayCoords;tintedColor;sprite;outlineColor;crumblingOverlay", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "pose;model;state;lightCoords;overlayCoords;tintedColor;sprite;outlineColor;crumblingOverlay", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }
    }

    public record f(Matrix4f a, idf.a b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "pose;leashState", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "pose;leashState", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "pose;leashState", "a", "b"}, this, $$0);
        }
    }

    public record l(Matrix4f a, float b, float c, bfr d, boolean e, gio.a f, int g, int h, int i, int j) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{l.class, "pose;x;y;string;dropShadow;displayMode;lightCoords;color;backgroundColor;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l.class, "pose;x;y;string;dropShadow;displayMode;lightCoords;color;backgroundColor;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l.class, "pose;x;y;string;dropShadow;displayMode;lightCoords;color;backgroundColor;outlineColor", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
        }
    }

    public record j(Matrix4f a, float b, float c, yh d, int e, int f, int g, double h) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{j.class, "pose;x;y;text;lightCoords;color;backgroundColor;distanceToCameraSq", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{j.class, "pose;x;y;text;lightCoords;color;backgroundColor;distanceToCameraSq", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{j.class, "pose;x;y;text;lightCoords;color;backgroundColor;distanceToCameraSq", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }
    }

    public record d(fzm.a a, idf b, Quaternionf c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "pose;entityRenderState;rotation", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "pose;entityRenderState;rotation", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "pose;entityRenderState;rotation", "a", "b", "c"}, this, $$0);
        }
    }

    public record k(Matrix4f a, float b, List<idf.b> c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{k.class, "pose;radius;pieces", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{k.class, "pose;radius;pieces", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{k.class, "pose;radius;pieces", "a", "b", "c"}, this, $$0);
        }
    }
}

