package reqres.in.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ResourceResponse {
private ResourceData data;

    public ResourceData getData() {
        return data;
    }

    public void setData(ResourceData data) {
        this.data = data;
    }
}
