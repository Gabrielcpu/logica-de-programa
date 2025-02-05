package JavaCore.ZZHPadrõesdeProjeto.domino;

public class ReportDTO {
    private String aircraftName;
    private Country country;
    private Currency currency;
    private String persoName;


    public static final class ReportDTOBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String persoName;

        private ReportDTOBuilder() {
        }

        public static ReportDTOBuilder builder() {
            return new ReportDTOBuilder();
        }

        public ReportDTOBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDTOBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDTOBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDTOBuilder persoName(String persoName) {
            this.persoName = persoName;
            return this;
        }

        public ReportDTO build() {
            ReportDTO reportDTO = new ReportDTO();
            reportDTO.country = this.country;
            reportDTO.aircraftName = this.aircraftName;
            reportDTO.persoName = this.persoName;
            reportDTO.currency = this.currency;
            return reportDTO;
        }

        @Override
        public String toString() {
            return "ReportDTOBuilder{" +
                    "aircraftName='" + aircraftName + '\'' +
                    ", country=" + country +
                    ", currency=" + currency +
                    ", persoName='" + persoName + '\'' +
                    '}';
        }
    }
}
