/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public class gbt
implements gbp {
    public static final gbt a = new gbt(gbs.b, null);
    @SerializedName(value="regionSelectionPreference")
    @JsonAdapter(value=gbs.a.class)
    public final gbs b;
    @SerializedName(value="preferredRegion")
    @JsonAdapter(value=gbf.a.class)
    public @Nullable gbf c;

    public gbt(gbs $$0, @Nullable gbf $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public gbt a() {
        return new gbt(this.b, this.c);
    }
}

