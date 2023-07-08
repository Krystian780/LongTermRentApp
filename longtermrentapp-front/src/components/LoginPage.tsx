import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const LoginPage: React.FC = () => {
    let navigate = useNavigate();
    const [email, setEmail] = useState<string>();
    const [password, setPassword] = useState<string>();

    const user = { email: email, password: password }

    const handleSignInClick = () => {
        console.log("handleSignInClick");
    }

    const handleSignUpClick = () => {
        console.log("handleSignUpClick");
        axios.post("/user/registration", user)
        .then(res => {
            navigate('/main');
        })
        .catch(() => {
            navigate('/')
        })
    }

    return (
        <section className="vh-100" style={{backgroundColor: "#333333"}}>
            <div className="container py-5 h-100">
                <div className="row d-flex justify-content-center align-items-center h-100">
                    <div className="col-12 col-md-8 col-lg-6 col-xl-5">
                        <div className="card shadow-2-strong" style={{borderRadius: "1em"}}>
                            <div className="card-body p-5 text-center">
                                <h3 className="mb-5">Sign in</h3>
                                <React.Fragment>
                                    <div className="form-outline mb-4">
                                        <input type="email" id="email" className="form-control" name="email" onChange={e => setEmail(e.target.value)} />
                                        <label className="form-label">e-mail address</label>
                                    </div>
                                    <div className="form-outline mb-4">
                                        <input type="password" id="password" className="form-control" name="password" onChange={e => setPassword(e.target.value)} />
                                        <label className="form-label">password</label>
                                    </div>
                                    <button className="btn btn-primary btn-block mb-4" onClick={handleSignInClick}>Sign in</button>
                                </React.Fragment>

                                <hr />
                                <h3 className="mb-5">Sign up</h3>
                                <React.Fragment>
                                    <div className="form-outline mb-4">
                                        <input type="email" id="email" className="form-control" name="email" onChange={e => setEmail(e.target.value)} />
                                        <label className="form-label">e-mail address</label>
                                    </div>
                                    <div className="form-outline mb-4">
                                        <input type="password" id="password" className="form-control" name="password" onChange={e => setPassword(e.target.value)} />
                                        <label className="form-label">password</label>
                                    </div>
                                    <button className="btn btn-primary btn-block mb-4" onClick={handleSignUpClick}>Sign up</button>
                                </React.Fragment>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    );
}


export default LoginPage;