// Last updated: 09/07/2026, 09:46:25
class OrderedStream {

    String[] stream;
    int ptr;

    public OrderedStream(int n) {

        stream = new String[n + 1];
        ptr = 1;
    }

    public List<String> insert(int idKey, String value) {

        stream[idKey] = value;

        List<String> result = new ArrayList<>();

        while (ptr < stream.length &&
               stream[ptr] != null) {

            result.add(stream[ptr]);
            ptr++;
        }

        return result;
    }
}