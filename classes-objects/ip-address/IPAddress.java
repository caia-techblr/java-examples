package ip-address;

public class IPAddress {
    
    private byte[] octets; // privaye int ipval;

    public IPAddress(byte o1, byte o2, byte o3, byte o4) {
        if (isValidOctet(o1) && isValidOctet(o2) && isValidOctet(o3) && isValidOctet(o4)) {
            this.octets = new byte[]{o1, o2, o3, o4};
        } else {
            throw new IllegalArgumentException("Each octet must be between 0 and 255.");
        }
    }
    public IPAddress(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Invalid IP address format.");
        }
        octets = new byte[4];
        for (int i = 0; i < 4; i++) {
            int octet = Integer.parseInt(parts[i]);
            if (!isValidOctet(octet)) {
                throw new IllegalArgumentException("Each octet must be between 0 and 255.");
            }
            octets[i] = (byte) octet;
        }
    }

    private boolean isValidOctet(int octet) {
        return octet >= 0 && octet <= 255;
    }

    public String getIPAddress() {
        return String.join(".", 
            String.valueOf(octets[0]), 
            String.valueOf(octets[1]), 
            String.valueOf(octets[2]), 
            String.valueOf(octets[3])
        );
    }

    public boolean isPrivate() {
        int first = octets[0];
        int second = octets[1];

        return (first == 10) ||
               (first == 172 && (second >= 16 && second <= 31)) ||
               (first == 192 && second == 168);
    }

    public boolean isLoopback() {
        return octets[0] == 127;
    }   

    @Override
    public String toString() {
        return getIPAddress();
    }
}
