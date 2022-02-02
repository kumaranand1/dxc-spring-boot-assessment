public class PersonDto {
    package com.dxc.personrestapi.Dto;


    import java.time.LocalDate;
    
    import javax.validation.constraints.NotBlank;
    
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class PersonDto {
        @NotBlank(message="user id is madatory")
        private Integer id;
        @NotBlank(message="user name is mandatory")
        private String name;
        @NotBlank(message="local date is mandatory")
        private LocalDate dob;
        @NotBlank(message="address is mandatory")
        private String address;
        @NotBlank(message="email is mandatory")
        private String email;
}
