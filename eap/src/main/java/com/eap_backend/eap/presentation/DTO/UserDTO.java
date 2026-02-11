package com.eap_backend.eap.presentation.DTO;
public class UserDTO {
    public static class UserResponseDTO {
        private int id;
        private String name;

        public UserResponseDTO() {}

        public UserResponseDTO(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public static class UserRequestDTO {
        private String name; 

        public UserRequestDTO() {}

        public UserRequestDTO(String name) {
            this.name = name;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }
}
