/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 */
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class gbk
implements gbp {
    @SerializedName(value="slotId")
    public int a;
    @SerializedName(value="options")
    @JsonAdapter(value=a.class)
    public gbn b;
    @SerializedName(value="settings")
    public List<gbj> c;

    public gbk(int $$0, gbn $$1, List<gbj> $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static gbk a(int $$0) {
        return new gbk($$0, gbn.b(), List.of(gbj.a(false)));
    }

    public gbk a() {
        return new gbk(this.a, this.b.c(), new ArrayList<gbj>(this.c));
    }

    public boolean b() {
        return gbj.a(this.c);
    }

    static class a
    extends TypeAdapter<gbn> {
        private a() {
        }

        public void a(JsonWriter $$0, gbn $$1) throws IOException {
            $$0.jsonValue(new gas().a($$1));
        }

        public gbn a(JsonReader $$0) throws IOException {
            String $$1 = $$0.nextString();
            return gbn.a(new gas(), $$1);
        }

        public /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            return this.a(jsonReader);
        }

        public /* synthetic */ void write(JsonWriter jsonWriter, Object object) throws IOException {
            this.a(jsonWriter, (gbn)object);
        }
    }
}

