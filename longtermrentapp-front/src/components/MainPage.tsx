import { useNavigate } from "react-router-dom";

const MainPage: React.FC = () => {
    let navigate = useNavigate();

    return (
        <>
        <nav className="navbar navbar-dark bg-dark">
            <a className="navbar-brand" style={{marginLeft: 10}}>LongTermRent Application</a>
        </nav>
        <section className="vh-100" style={{ backgroundColor: "#333333" }} >
            <div className="container">
                <div className="row">
                    <div className="col">
                        
                    </div>
                </div>
            </div>
        </section>
        </>
    )
}

export default MainPage;