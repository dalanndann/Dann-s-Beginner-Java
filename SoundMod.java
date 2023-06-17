class SoundMod {
    public static void main(String[] args) {
        // compute distance of a sound source to surface in terms of echo

        double distance;

        // assume echo interval is 7.2 seconds

        distance = 7.2 * 1100 / 2;
        System.out.println("The distance from a sound source to the surface is " + distance + " feet.");
    }
}