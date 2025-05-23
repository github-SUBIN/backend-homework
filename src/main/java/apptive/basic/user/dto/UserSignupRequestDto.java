package apptive.basic.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserSignupRequestDto
{
    @Email(message = "이메일 형식을 맞춰주세요.")
    @NotBlank(message = "이메일은 필수입니다.")
    private String email;
    @NotBlank(message = "이름은 필수입니다.")
    @Size(min=3, message = "이름은 3자 이상이어야 합니다.")
    private String name;
    @NotBlank(message = "비밀번호는 필수입니다.")
    @Size(min=10, message = "비밀번호는 10자 이상이어야 합니다.")
    private String password;
    @NotBlank(message = "비밀번호 확인은 필수입니다.")
    private String confirmPassword;

    public UserSignupRequestDto(String email, String name, String password, String confirmPassword)
    {
        this.email=email;
        this.name=name;
        this.password=password;
        this.confirmPassword=confirmPassword;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }

    public String getConfirmPassword()
    {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
